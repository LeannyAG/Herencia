package Ejercicio1;

public class Persona {

	
	protected String nombre;
	protected int edad;
	
	
	
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}




	public void mostrar() {
		System.out.println("nombre:  " + nombre);
		System.out.println("edad: " + edad);
	}
	
}
