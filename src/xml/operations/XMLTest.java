package xml.operations;

import java.io.File;
import java.util.ArrayList;

import poller.GCPoller;
import poller.findFilesToProcess;
import process.process;
import processor.ProcessorTimeLineWrapper;
import tables.gc;

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
		

		XMLParameters paramset = new XMLParameters();
		paramset.setIsQ(true);
		paramset.setClassName("class");
		paramset.setMethodName("method");
		paramset.makeQParam(0);
		paramset.makeQParam("writer");
		paramset.makeQParam(0.89);
		xmlWriter x = new xmlWriter();
		x.write(paramset);

		
		findFilesToProcess f = new findFilesToProcess();
		Thread t1 = new Thread(f);
		t1.start();
		t1.join();
		for(File ft : f.FilesToProcess) {
			
			System.out.println(ft.toString());
		}
		
		ArrayList<Object> Processed = new ArrayList<Object>();
		gc togc = new gc();
		
		togc.setpath(findFilesToProcess.FilesToProcess.get(0).toString());
		Processed.add(togc);
		process.Insert("gc",Processed) ;
		
		GCPoller gp = new GCPoller();
		Thread t2 = new Thread(gp);
		t2.start();
		
		
		processor.ProcessorTimeLineWrapper pr = new ProcessorTimeLineWrapper();
		Thread t3 = new Thread(pr);
		t3.start();
		
		
	}

}
