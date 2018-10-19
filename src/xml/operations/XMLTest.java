package xml.operations;

public class XMLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		XMLParameters paramSet = new XMLParameters();
		paramSet.setIsWs(true);
		paramSet.setUrl("https://google.com");
		paramSet.setIsPort(true);
		paramSet.setPort(9900);
		paramSet.CreateNewIntParam(67);
		paramSet.CreateStringParam("yes");
		paramSet.CreateNewIntParam(88);
		
		xmlWriter xw = new xmlWriter();
		xw.write(paramSet);
	}

}
