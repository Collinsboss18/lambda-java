package FunctionalInterface;

public class ClientTest {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			public void run () {
				System.out.println("My function is excuting...");
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}

}