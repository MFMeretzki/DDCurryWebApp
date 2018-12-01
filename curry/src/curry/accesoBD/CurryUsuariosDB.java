package curry.accesoBD;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CurryUsuariosDB {

	private HashMap<String, String> userData;
	
	public CurryUsuariosDB()
	{
		try {
			
			String path = CurryConfigDB.getInstance().getData("userDB");
			
		 	userData = new HashMap<String, String>();
			File fXmlFile = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
					
			NodeList nList = doc.getElementsByTagName("usuario");
					

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					String keyElement = eElement.getElementsByTagName("nombreUsuario").item(0).getTextContent();
					String value = eElement.getElementsByTagName("password").item(0).getTextContent();
					userData.put(keyElement, value);

				}
			}
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	public boolean iniciarSesion(String usuario, String password)
	{
		boolean correcto = false;
		
		if(userData.containsKey(usuario))
			correcto = userData.get(usuario).equals(password);
				
		return correcto;
	}
	
}
