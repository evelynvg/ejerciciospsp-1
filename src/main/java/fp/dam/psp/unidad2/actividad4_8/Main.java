package fp.dam.psp.unidad2.actividad4_8;

public class Main {
	
	private static Almacen almacen = new Almacen(10);

	public static void main(String[] args) throws InterruptedException {
		Thread p = new Productor(almacen);
		Thread c1 = new Consumidor(almacen, 1);
		Thread c2 = new Consumidor(almacen, 2);
		c1.start();
		c2.start();
		p.start();
	}

}
