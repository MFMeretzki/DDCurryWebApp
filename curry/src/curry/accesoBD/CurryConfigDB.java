package curry.accesoBD;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CurryConfigDB {

	private static CurryConfigDB instance;
	private static String configPath = "F:/Web/config/rutaDB.xml";
	private static HashMap<String, String> configData;
	
	private CurryConfigDB()
	{
		 try {
			 	configData = new HashMap<String, String>();
				File fXmlFile = new File(configPath);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
						
				doc.getDocumentElement().normalize();
						
				NodeList nList = doc.getElementsByTagName("ruta");
						

				for (int temp = 0; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);
							
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
							
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;
						String key = eElement.getElementsByTagName("nombre").item(0).getTextContent();
						String value = eElement.getElementsByTagName("path").item(0).getTextContent();
						configData.put(key, value);
					}
				}
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
	
	public String getData(String key) throws Exception
	{
		if(!configData.containsKey(key))
			throw new Exception("No existe esa clave en la base de datos");
		
		return configData.get(key);
	}
	
	public static CurryConfigDB getInstance()
	{
		if(instance == null)
			instance = new CurryConfigDB();
		
		return instance;
	}
	
}
