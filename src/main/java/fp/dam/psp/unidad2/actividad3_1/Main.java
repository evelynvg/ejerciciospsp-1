package fp.dam.psp.unidad2.actividad3_1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new HiloEjemploJoin("Mi Hilo uno");
		Thread t2 = new HiloEjemploJoin("Mi Hilo dos");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Finaliza el hilo principal");
	}

}
