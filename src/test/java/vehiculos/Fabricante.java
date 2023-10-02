package vehiculos;

import java.util.ArrayList;

import java.util.List;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int cantidadVehiculos;
	private static List<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		
		Fabricante.fabricantes.add(this);
		
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
		
		int max = 0;
		Fabricante muu = null;
		
		for (int i = 0; i<Fabricante.fabricantes.size(); i++){
			
			int x = Fabricante.fabricantes.get(i).cantidadVehiculos;
			
			if (max < x) {
				
				max = x;
				muu = Fabricante.fabricantes.get(i);
	
			}
			
		}
		
		return muu;
		
	}

}