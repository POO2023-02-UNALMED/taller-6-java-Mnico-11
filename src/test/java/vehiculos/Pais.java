package vehiculos;


import java.util.List;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private int cantidadVehiculos;
	private static List<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		
		this.nombre = nombre;
		
		Pais.paises.add(this);
		
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
		
		int max = 0;
		Pais vaa = null;
		
		for (int i = 0; i<Pais.paises.size(); i++){
			
			int x = Pais.paises.get(i).cantidadVehiculos;
			
			if (max < x) {
				
				max = x;
				vaa = Pais.paises.get(i);
	
			}
			
		}
		
		return vaa;
		
	}

}
