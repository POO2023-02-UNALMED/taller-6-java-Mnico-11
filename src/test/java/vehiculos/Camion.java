package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	private static String cantidadCamiones;
	
	public Camion(String placa, String nombre, int peso, int precio, Fabricante fabricante, int ejes) {
		
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		
		Camion.cantidadCamiones += 1;
		
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static String getCantidadCamiones() {
		return cantidadCamiones;
	}

	public static void setCantidadCamiones(String cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}

}
