package xml.operations;

import java.util.ArrayList;
import java.util.HashMap;

public class XMLParameters {
	
	// ws
	
	public Boolean isQ = true;
	public Boolean isWs = false;
	
	public String url = null;
	public Boolean isPort = false;
	public int port = 0;
	
	public ArrayList<Integer> intParam = new ArrayList<>();
	public ArrayList<String> stringParam = new ArrayList<String>();
	
	public ArrayList<String> getStringParam() {
		return stringParam;
	}

	public void setStringParam(ArrayList<String> stringParam) {
		this.stringParam = stringParam;
	}

	public HashMap<Integer,String> Index = new HashMap<Integer,String>();
	
	public int i= 0 ;
	
	//Q
	public String ClassName = null;
	public String MethodName = null;
	
	
	
	
	
	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public String getMethodName() {
		return MethodName;
	}

	public void setMethodName(String methodName) {
		MethodName = methodName;
	}

	public int IndexMaintainence() {
		
	return ++i;	
		
	}
	
	public void CreateNewIntParam(int arg) {
		
		intParam.add(arg);
		Index.put(IndexMaintainence(),"integer");
		
	}
	
	public Boolean getIsQ() {
		return isQ;
	}

	public void setIsQ(Boolean isQ) {
		this.isQ = isQ;
	}

	public Boolean getIsWs() {
		return isWs;
	}

	public void setIsWs(Boolean isWs) {
		this.isWs = isWs;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsPort() {
		return isPort;
	}

	public void setIsPort(Boolean isPort) {
		this.isPort = isPort;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ArrayList<Integer> getIntParam() {
		return intParam;
	}

	public void setIntParam(ArrayList<Integer> intParam) {
		this.intParam = intParam;
	}

	public void CreateStringParam(String arg) {
		
		
		stringParam.add(arg);
		Index.put(IndexMaintainence(),"string");
		
	}
	
	

}
