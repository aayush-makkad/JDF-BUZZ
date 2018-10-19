package poller;

import java.io.File;
import java.util.ArrayList;

public class findFilesToProcess implements Runnable{
	
	
	public static ArrayList<File> FilesToProcess = new ArrayList<File>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		File directory = new File(System.getProperty("user.dir"));
		for(File f : directory.listFiles())
		{
			if(f.getName().toLowerCase().endsWith(".xml")) {
				FilesToProcess.add(f);
			}
		}
		
		
	}
	
	
	
	
	
	

}
