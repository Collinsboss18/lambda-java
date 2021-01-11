package FunctionalInterface;

public class ClientTest {

	public static void main(String[] args) {
		threadUsingAnonymous();
		threadUsingLamdaExpression();
	}
	
	private static void threadUsingLamdaExpression() {
		/** Converting Anonymous Thread Method to Lambda expression */
		Runnable r = () -> System.out.println("My function is excuting...");
		
		Thread thread = new Thread(r);
		thread.start();
	}

	public static void threadUsingAnonymous() {
		Runnable r = new Runnable() {
			
			public void run () {
				System.out.println("My function is excuting...");
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}

}
