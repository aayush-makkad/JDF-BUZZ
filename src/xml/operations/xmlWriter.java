package xml.operations;

import java.io.File;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class xmlWriter {
	
	
	/*
	 * 
	 * Accepts XMLParameters and creates a new XML
	 * to be processed by parser threads.
	 * 
	 * JDF-BUZZ GC will delete XML Files on basis 
	 * of FIFO
	 * 
	 */
	public void write(XMLParameters arg) {
		
		
		if(arg.getIsWs()) {
			
			try{
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.newDocument();
				
				//create here
				
				Element rootElement = doc.createElement("Process-WS");
		        doc.appendChild(rootElement);
		        
		        Element connect = doc.createElement("url");
		        rootElement.appendChild(connect);
		        
		        Attr attr = doc.createAttribute("address");
		        attr.setValue(arg.getUrl());
		        connect.setAttributeNode(attr);
		        
		        if(arg.getIsPort()) {
		        
		        Element schema = doc.createElement("port");
		        rootElement.appendChild(schema);
		        
		        Attr attr2 = doc.createAttribute("number");
		        attr2.setValue(String.valueOf(arg.getPort()));
		        schema.setAttributeNode(attr2);
		        
		        }
		        
		        int index = 0;
		        int StringIndex = 0;
		        int intIndex = 0;
		        
		        while(index < arg.Index.size()-1) {
		        
		        	
		        	
		        Element user = doc.createElement("parameter");
		        rootElement.appendChild(user);
		        
		        
		        for(Entry<Integer, String> e : arg.Index.entrySet()) {
		        
		        	index++;
		        	
		        	if(e.getValue().equalsIgnoreCase("string")) {
		        	
		        		
				        Element schema1 = doc.createElement("param-string");
				        user.appendChild(schema1);
				        
				        Attr attr3 = doc.createAttribute("parameter");
				        attr3.setValue(arg.getStringParam().get(StringIndex));
				        schema1.setAttributeNode(attr3);
		        		
		        		
		        	}
		        	else {
		        		
				        
		        		
				        Element schema2 = doc.createElement("param-int");
				        user.appendChild(schema2);
				        
				        Attr attr4 = doc.createAttribute("parameter");
				        attr4.setValue(String.valueOf(arg.getIntParam().get(intIndex)));
				        intIndex++;
				        schema2.setAttributeNode(attr4);
		        		
		        		
		        	}
		        }
		        
		        }
		        
		        
		        TransformerFactory transformerFactory = TransformerFactory.newInstance();
		        Transformer transformer = transformerFactory.newTransformer();
		      
		        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		        DOMSource source = new DOMSource(doc);
		        StreamResult result = new StreamResult(new File("process-WS"+String.valueOf(ThreadLocalRandom.current().nextLong())+".xml"));
		        transformer.transform(source, result);
		        
		        StreamResult consoleResult = new StreamResult(System.out);
		        transformer.transform(source, consoleResult);
				
				}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(arg.getIsQ())
		{
			
			try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			
			//create here
			
			Element rootElement = doc.createElement("Process-Q");
	        doc.appendChild(rootElement);
	        
	        Element connect = doc.createElement("class");
	        rootElement.appendChild(connect);
	        
	        
	        Element name = doc.createElement("Class-Name");
	        //Attr attrType = doc.createAttribute("Name");
	        //attrType.setValue(ColName);
	        //name.setAttributeNode(attrType);
	        name.appendChild(doc.createTextNode(arg.getClassName()));
	        connect.appendChild(name);
	        
	        
	        
	        Element schema = doc.createElement("method");
	        rootElement.appendChild(schema);
	        
	        
	        Element mname = doc.createElement("Method-Name");
	        //Attr attrType = doc.createAttribute("Name");
	        //attrType.setValue(ColName);
	        //name.setAttributeNode(attrType);
	        mname.appendChild(doc.createTextNode(arg.getMethodName()));
	        schema.appendChild(mname);
	        
	        
	        
	        int index = 0;
	        int StringIndex = 0;
	        int intIndex = 0;
	        
	        while(index < arg.Index.size()-1) {
	        
	        	
	        	
	        Element user = doc.createElement("parameter");
	        rootElement.appendChild(user);
	        
	        
	        for(Entry<Integer, String> e : arg.Index.entrySet()) {
	        
	        	index++;
	        	
	        	if(e.getValue().equalsIgnoreCase("string")) {
	        	
	        		
			        Element schema1 = doc.createElement("param");
			        user.appendChild(schema1);
			        
			        
			        
			        Element para = doc.createElement("param-val");
			        //Attr attrType = doc.createAttribute("Name");
			        //attrType.setValue(ColName);
			        //name.setAttributeNode(attrType);
			        para.appendChild(doc.createTextNode(arg.getStringParam().get(StringIndex)));
			        para.appendChild(schema1);
			        
			        
			        
			        
			        
			        
			        Attr attr6 = doc.createAttribute("type");
			        attr6.setValue(arg.getStringParam().get(StringIndex));
			        schema1.setAttributeNode(attr6);
	        		
	        		
	        	}
	        	else {
	        		
			        
	        		
			        Element schema2 = doc.createElement("param");
			        user.appendChild(schema2);
			        
			        Attr attr4 = doc.createAttribute("parameter");
			        attr4.setValue(String.valueOf(arg.getIntParam().get(intIndex)));
			        intIndex++;
			        schema2.setAttributeNode(attr4);
	        		
	        		
	        	}
	        }
	        
	        }
	        
	        
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	      
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
	        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(new File("process-Q"+String.valueOf(ThreadLocalRandom.current().nextLong())+".xml"));
	        transformer.transform(source, result);
	        
	        StreamResult consoleResult = new StreamResult(System.out);
	        transformer.transform(source, consoleResult);
			
			}	
		catch(Exception e) {
			e.printStackTrace();
		}
			
			
			
			
		}
		
		
	}
	

}
