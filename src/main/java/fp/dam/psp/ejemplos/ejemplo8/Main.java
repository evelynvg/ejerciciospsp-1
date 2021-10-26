package fp.dam.psp.ejemplos.ejemplo8;


public class Main extends Thread {

	public volatile static boolean parar;
	
	@Override
	public void run() {
		while (!parar);
		System.err.println("hilo secundario detenido");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Main();
		t.start();
		Thread.currentThread().sleep(2000);
		parar = true;
		System.out.println("hilo principal detenido");
	}

}
