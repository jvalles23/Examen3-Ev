package Ejercicio2;

public class Provincias {
	private String nombre;
	
	public Provincias(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Provincias [nombre=" + nombre + "]";
	}
	
	
}
