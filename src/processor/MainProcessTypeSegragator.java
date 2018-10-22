package processor;

import java.io.File;
import java.util.ArrayList;
import java.util.Map.Entry;

public class MainProcessTypeSegragator implements Runnable{
	
	
	
	private static ArrayList<File> QFiles = new ArrayList<File>();
	private static ArrayList<File> WSFiles = new ArrayList<File>();


	public static ArrayList<File> getQFiles() {
		return QFiles;
	}


	public static ArrayList<File> getWSFiles() {
		return WSFiles;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ArrayList<File> AllFiles = new ArrayList<File>();
		
		for(Entry<File, File> e : GenericDataFetcher.getCommandsToProcess().entrySet()) {
			AllFiles.add(e.getKey());
		}
		
	
		
		for(File f : AllFiles) {
			
			if(f.getName().contains("Q")) {
				QFiles.add(f);
			}else {
				WSFiles.add(f);
			}
			
			
		}
		
		
		
	}
	
	
	
	

}
