package fp.dam.psp.unidad2.actividad3_1;

public class HiloEjemploJoin extends Thread {
	
	public HiloEjemploJoin(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (getName().equalsIgnoreCase("Mi Hilo uno")) {
				System.out.println(i + " " + getName() + " ---->");
			} else {
				System.out.println(i + " " + getName() + "<----");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Finaliza el Hilo " + getName());
	}
}