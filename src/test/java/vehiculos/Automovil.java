package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static String cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int peso, int precio, Fabricante fabricante, int puestos) {
		
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		
		Automovil.cantidadAutomoviles += 1;
		
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static String getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	public static void setCantidadAutomoviles(String cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}

}
