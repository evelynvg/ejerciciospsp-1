package fp.dam.psp.unidad2.actividad4_8;

public class Productor extends Thread {

	private Almacen almacen;
	
	public Productor(Almacen almacen) {
		this.almacen = almacen;
	}
	
	@Override
	public void run() {
		while (!almacen.cerrado())
			almacen.setProducto();
	}
	
}