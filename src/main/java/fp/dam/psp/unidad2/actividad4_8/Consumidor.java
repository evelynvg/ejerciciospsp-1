package fp.dam.psp.unidad2.actividad4_8;

public class Consumidor extends Thread {

	private long contador;
	private Almacen almacen;
	
	public Consumidor(Almacen almacen, int n) {
		super("Consumidor " + n);
		this.almacen = almacen;
	}
	
	@Override
	public void run() {
		while (!almacen.cerrado())
			if (almacen.getProducto() != null)
				contador++;
		System.out.println(getName() + " ha consumido " + contador + " productos");
	}
	
}
