package pz05;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class pz05{
	public static String EOF = new String();
	
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
				Object take1 = (Object) queue.take();
				Dot take = (Dot) take1;
				double cord_fir = take.x;
				double cord_sec = take.y;
				int dist = (int) Math.sqrt(Math.pow(cord_sec, 2)+Math.pow(cord_fir, 2));
				System.out.println("___[ ("+cord_fir+","+cord_sec+")"+"  distance = "+dist+" ]___");
		        System.out.println("___[ Consumed   " + take.toString()+"    ]___\n");
		        try{ 
		        	if ((String)take1 == EOF)
					Thread.currentThread().interrupt();
		        }catch(ClassCastException e) {
		        	continue;
		        }
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
			 try {
				queue.put(EOF);
			} catch (InterruptedException e) {
			}
			 
		}
		
		public Producer(BlockingQueue queue, Dotlist list) {
			this.queue = queue;
			this.list = list;
		}
	
		public void run() {
			try {
				for(int i=0; i< list.Dotlist.size();i++) {  
		          queue.put(list.Dotlist.get(i));
		          System.out.println("___[ Produced   " + String.valueOf(list.Dotlist.get(i).toString())+"    ]___"); 
					Thread.sleep((long) (Math.random()*990));
				}
		 	        } catch (InterruptedException e) {
						Thread.currentThread().interrupt();
		        }
		}
	
	}
	
	static class Stopper extends Thread {
		private Thread prod;
		private Thread cons;
		
		public Stopper(Thread one,Thread two) {
			this.prod = one;
			this.cons = two;
			
		}
		@Override
		public void run() {

			try {
				Scanner in = new Scanner(System.in);
				while (!Thread.interrupted()) {
					String a = in.nextLine();
						stopall();
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

		}

		private void stopall() throws InterruptedException {
			prod.interrupt();
			cons.interrupt();
			Thread.currentThread().interrupt();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Dotlist first = new Dotlist(); 
		
		System.out.println(first.getHash()+ "\nDotlist:");
		for(int i=0; i<first.Dotlist.size();i++) 
			System.out.println(first.Dotlist.get(i).toString());
		
		System.out.println("\nProducer-Consumer work:\n");
		BlockingQueue queue = new LinkedBlockingQueue<>(first.Dotlist.size());
		Thread prod = new Thread(new Producer(queue, first));
		Thread cons = new Thread(new Consumer(queue));
		Thread Stopper = new Thread(new Stopper(prod,cons));
		prod.start();
		cons.start();
		Stopper.start();
	}
}
