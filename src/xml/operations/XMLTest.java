package xml.operations;

import java.io.File;

import poller.findFilesToProcess;
import process.process;

public class XMLTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
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
		
		*/
		
		/*
		XMLParameters paramset = new XMLParameters();
		paramset.setIsQ(true);
		paramset.setClassName("class");
		paramset.setMethodName("method");
		paramset.CreateNewIntParam(0);
		paramset.CreateStringParam("string");
		paramset.CreateNewIntParam(0);
		
		xmlWriter x = new xmlWriter();
		x.write(paramset);
		*/
		
		findFilesToProcess f = new findFilesToProcess();
		Thread t1 = new Thread(f);
		t1.start();
		t1.join();
		for(File ft : f.FilesToProcess) {
			
			System.out.println(ft.toString());
		}
		
		
	}

}
