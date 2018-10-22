package poller;

import java.io.File;
import java.util.ArrayList;
import java.util.Properties;

import tables.gc;

public class GCPoller implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		/*ArrayList<Object> gcList = new ArrayList<Object>();
		gcList = process.process.SelectAll("gc");
		
		
		for(Object o : gcList) {
			
			gc _gc = gc.class.cast(o);
			
			File f = new File(_gc.getpath());
			f.delete();
			
		}*/
		
		
		
		File directory = new File(System.getProperty("user.dir"));
		for(File f : directory.listFiles())
		{
			if(f.getName().toLowerCase().endsWith(".gbc")) {
				f.delete();
			}
		}
		
		
		
		
		
	}
	
	
	

}
