package processor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ProcessorTimeLineWrapper implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		GenericDataFetcher gdf = new GenericDataFetcher();
		Thread t1 = new Thread(gdf);
		
		MainProcessTypeSegragator mpts = new MainProcessTypeSegragator();
		Thread t2 = new Thread(mpts);
		
		
		ScheduledExecutorService es = new ScheduledExecutorService() {
			
			@Override
			public void execute(Runnable command) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <T> Future<T> submit(Runnable task, T result) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Future<?> submit(Runnable task) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> Future<T> submit(Callable<T> task) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Runnable> shutdownNow() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void shutdown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isTerminated() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isShutdown() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
					throws InterruptedException, ExecutionException, TimeoutException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
					throws InterruptedException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		es.scheduleAtFixedRate(t1, 0, 500,TimeUnit.MILLISECONDS);
		es.scheduleAtFixedRate(t2, 0, 600, TimeUnit.MILLISECONDS);
		
	}
	
	
	
	
	

}
