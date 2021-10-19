package fp.dam.psp.ejemplos;

public class Main {

	public static void main(String[] args) {
		Thread hilo = new Thread(Main::hacerAlgo);
		hilo.start();
	}
	
	private static void hacerAlgo() {
		System.out.println("soy el hilo");
		while (true);
	}
}
