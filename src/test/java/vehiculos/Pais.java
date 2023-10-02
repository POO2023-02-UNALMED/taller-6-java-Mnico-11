package vehiculos;

import java.util.List;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private int cantidadVehiculos;
	private static List<Pais> paises = new ArrayList<Pais>();
	int count;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVehiculos = cantidadVehiculos;
	}

	public static List<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(List<Pais> paises) {
		Pais.paises = paises;
	}
	
	public static Pais paisMasVendedor() {
		Pais ven = paises.get(0);
		for(int i=1; i < paises.size(); i++) {
			if(ven.count < paises.get(i).count) {
				ven = paises.get(i);
			}
		}
		return ven;
	}

}
