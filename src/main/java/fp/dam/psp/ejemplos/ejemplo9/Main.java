package fp.dam.psp.ejemplos.ejemplo9;

public class Main {

	private static Contador c = new Contador();
	
	public static void run() {
		for (int i=0; i<100000; i++) {
			c.inc();
			Thread.yield();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(Main::run);
		Thread t2 = new Thread(Main::run);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.get());
	}

}
