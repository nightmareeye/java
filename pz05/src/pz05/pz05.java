package pz05;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class pz05{
	static int size= 3;
	//static BlockingQueue queue = new LinkedBlockingQueue(size);
	
	static class Consumer extends Thread{
		private final BlockingQueue queue;
		private Dot take = null;
	
		public Consumer(BlockingQueue queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					take = (Dot) queue.take();
					double cord_fir = take.x;
					double cord_sec = take.y;
				int dist = (int) Math.sqrt(Math.pow(cord_sec, 2)+Math.pow(cord_fir, 2));
				System.out.println("("+cord_fir+","+cord_sec+")"+"  distance = "+dist);
		        System.out.println("___[ Consumed " + take.toString()+" ]___\n");
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	
	}
	
	static class Producer extends Thread {
		private final BlockingQueue queue;
		private Dotlist list = null;
	
		public void interrupt() {
			 Thread.currentThread().interrupt();
		}
		
		public Producer(BlockingQueue queue, Dotlist list) {
			this.queue = queue;
			this.list = list;
		}
	
		public void run() {
			int delay = (int) (Math.random()*size);
			try {
				for(int i=0; i< list.Dotlist.size();i++) {
		          Thread.sleep((long) (Math.random()*900));  
		          queue.put(list.Dotlist.get(i));
		          System.out.println("___[ Produced " + String.valueOf(list.Dotlist.get(i).toString())+" ]___"); 
				}
		 	        } catch (InterruptedException e) {
						Thread.currentThread().interrupt();
		        }
		}
	
	}
	public static void main(String[] args) throws IOException {
		Dotlist first = new Dotlist(); 
		System.out.println(first.getHash()+ "\nDotlist:");
		//System.out.println(first.Dotlist.size());
		for(int i=0; i<first.Dotlist.size();i++) 
			System.out.println(first.Dotlist.get(i).toString());
		System.out.println("\nProducer-Consumer work:\n");
		BlockingQueue queue = new LinkedBlockingQueue<>(100);
		Thread prod = new Thread(new Producer(queue, first));
		Thread cons = new Thread(new Consumer(queue));
		prod.start();
		cons.start();
	}
}
