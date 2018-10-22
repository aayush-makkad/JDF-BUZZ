package processor;

import java.io.File;
import java.util.HashMap;

public class GenericDataFetcher implements Runnable{
	
	/*
	 * 
	 * Hashmap to prevent files from being put in process
	 * which are already processed but haven't been removed 
	 * neither from map nor has been converted to
	 * garbage collectible form
	 * 
	 */
	private static HashMap<File,File> commandsToProcess = new HashMap<File,File>();


	@Override
	public void run() {
		// TODO Auto-generated method stub
			
		for(File f : poller.findFilesToProcess.getFilesToProcess()) {
			commandsToProcess.put(f, f);
		}
		
	}


	public static HashMap<File, File> getCommandsToProcess() {
		return commandsToProcess;
	}
	
	
	
	

}
