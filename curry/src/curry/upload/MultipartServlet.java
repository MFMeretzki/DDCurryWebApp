package curry.upload;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FilenameUtils;

import curry.constants.Rutas;
import curry.constants.Sesion;

/**
 * Servlet implementation class MultipartServlet
 */
@WebServlet("/uploader")
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
maxFileSize = 1024 * 1024 * 25, 
maxRequestSize = 1024 * 1024 * 25 * 50)
public class MultipartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultipartServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = (String) request.getSession(false).getAttribute(Sesion.SESSION_USER);
		
		iniciarCarpetas();
		
		String uploadPath = Rutas.RUTA_UPLOAD + File.separator + usuario;
		
		File dir = new File(Rutas.RUTA_UPLOAD);
		if (!dir.exists()) dir.mkdir();
		
		dir = new File(uploadPath);
		if (!dir.exists()) dir.mkdir();
		
		for (Part part : request.getParts()) {
		    String fileName = part.getSubmittedFileName();

		    if(fileName != null) {
			    String baseUrl = FilenameUtils.getPath(fileName);
			    try {
					String[] folderHierarchy = getFoldersFromPath(baseUrl);
					createAllFolders(uploadPath, folderHierarchy);
				} catch (ForbbidenPathException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    System.out.println(uploadPath + File.separator + fileName);
		    	part.write(uploadPath + File.separator + fileName);
		    }
		}
	}
	
	public void iniciarCarpetas()
	{
		File dir = new File(Rutas.RUTA_ARCHIVOS);
		if (!dir.exists()) System.err.println("NO EXISTE LA CARPETA " + Rutas.RUTA_ARCHIVOS);
		dir = new File(Rutas.RUTA_UPLOAD);
		if (!dir.exists()) dir.mkdir();
	}
	
	/**
	 * Crea en orden los directorios con el formato <b>prePath</b>+ruta de las
	 * rutas contenidas en el array.
	 * @param prePath Ruta base
	 * @param folderHierarchy Ruta de los directorios
	 */
	public void createAllFolders(String prePath, String[] folderHierarchy) {
		
		for(int i = 0; i < folderHierarchy.length; ++i) {
			File f = new File(prePath + File.separator + folderHierarchy[i]);
			if (!f.exists()) {
				f.mkdir();
				System.out.println("Creado: " + f.getPath());
			}
		}
		
	}
	
	/**
	 * Obtiene la ruta de todos los directorios que contienen a la
	 * ruta especificada.
	 * @param path Ruta de directorios
	 * @return	String[] con cada una de las carpetas contenedoras
	 * @throws ForbbidenPathException Excepción que se obtiene si algún nombre de
	 * directorio es <b>'..'</b> o <b>'.'</b>.
	 */
	public String[] getFoldersFromPath(String path) throws ForbbidenPathException {
		String[] pathElements = path.split("/");
		String[] folderPaths = new String[pathElements.length];
		
		for(String s : pathElements) {
			if(s.equals("..") || s.equals("."))
				throw new ForbbidenPathException();
			
			for(int i = 0; i < pathElements.length; ++i)
			{
				if(i == 0)
					folderPaths[i] = pathElements[i];
				else
					folderPaths[i] = pathElements[i-1] + File.separator + pathElements[i];
			}
		}
		
		return folderPaths;
	}
	
}
