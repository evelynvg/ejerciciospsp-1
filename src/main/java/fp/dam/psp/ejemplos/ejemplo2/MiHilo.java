package fp.dam.psp.ejemplos.ejemplo2;

public class MiHilo extends Thread {

	@Override
	public void run() {
		System.out.println("hola, soy el hilo");
		while (true);
	}

	public MiHilo(String name) {
		super(name);
	}
	
	
	
}
