package fp.dam.psp.ejemplos.ejemplo4;

public class EmitirSonido extends Thread {
	
	String sonido;

	public EmitirSonido(String sonido) {
		this.sonido = sonido;
	}
	
	@Override
	public void run() {
		while (true)
			System.out.print(sonido + " ");
	}
	
}
