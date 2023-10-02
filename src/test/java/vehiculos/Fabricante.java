package vehiculos;

import java.util.ArrayList;

import java.util.List;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int cantidadVehiculos;
	private static List<Fabricante> fabricantes = new ArrayList<Fabricante>();
	int count;
	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVehiculos = cantidadVehiculos;
	}

	public static List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static void setFabricantes(List<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante ven = fabricantes.get(0);
		for(int i=1; i < fabricantes.size(); i++) {
			if(ven.count < fabricantes.get(i).count) {
				ven = fabricantes.get(i);
			}
		}
		return ven;
	}

}