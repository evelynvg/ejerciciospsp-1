package fp.dam.psp.unidad2.actividad4_8;

public class Almacen {
	
	private String producto;
	private long contador;
	
	public Almacen(long productos) {
		contador = productos;
	}

	public synchronized String getProducto() {
		while (producto == null && contador > 0)
			try {
				wait();
			} catch (InterruptedException e) {
			}
		String producto = this.producto;
		this.producto = null;
		notifyAll();
		return producto;
	}

	public synchronized void setProducto() {
		if (producto != null)
			try {
				wait();
			} catch (InterruptedException e) {
			}
		producto = Thread.currentThread() + " " + contador--;
		notifyAll();
	}
	
	public boolean cerrado() {
		return contador == 0;
	}
	
}
