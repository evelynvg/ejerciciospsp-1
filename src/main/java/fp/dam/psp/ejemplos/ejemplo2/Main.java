package fp.dam.psp.ejemplos.ejemplo2;

public class Main {

	public static void main(String[] args) {
		Thread hilo = new MiHilo("Mi hilo nuevo");
		hilo.start();
	}

	
	
}
