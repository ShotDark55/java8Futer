package java8Futures;

public class Lamba {
	
	
	public static void main(String[] args) {
		
		// lambda expression
		Runnable run = () -> System.out.println("Thread is working !"); 
			
		// lambda statement
		Runnable run_1 = () -> {
			int x = 0;
			while(x > 50) {
				
				try {
					Thread.sleep(200);
				}catch(Exception ex) {}
				System.out.print(x++);
			}
		
		};
		
		
		Thread t1 = new Thread(run);
		t1.start();
		
		
	}

}
