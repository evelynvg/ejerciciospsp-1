package fp.dam.psp.ejemplos.ejemplo9;

public class Contador {

	private long n;
	
	public synchronized void inc() {
		n++;
	}
	
	public long get() {
		return n;
	}
	
}
