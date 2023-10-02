package vehiculos;

public class Camioneta extends Vehiculo {
	
	private boolean volco;
	private static String cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int peso, int precio, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		
		Camioneta.cantidadCamionetas += 1;
		
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static String getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public static void setCantidadCamionetas(String cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}

}