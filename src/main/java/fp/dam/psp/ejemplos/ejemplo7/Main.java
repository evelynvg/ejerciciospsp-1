package fp.dam.psp.ejemplos.ejemplo7;

public class Main extends Thread {
	
	private long sleep;
	private static Thread hiloMain;
	
	public Main(long sleep) {
		this.sleep = sleep;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " ha finalizado su tarea");
	}
	
	private void hilo3() {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hiloMain.interrupt();
	}

	public static void main(String[] args) {
		hiloMain = Thread.currentThread();
		Main m = new Main(2000);
		Thread t1 = new Main(10000);
		Thread t2 = new Main(20000);
		t1.start();
		t2.start();
		new Thread(m::hilo3).start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("hilo principal interrumpido");
		}
		
		System.exit(0);
	}

}
