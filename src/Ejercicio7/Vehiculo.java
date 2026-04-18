package Ejercicio7;

public class Vehiculo {

	
	protected String marca;
	protected double velocidad;
	
	
	
	public Vehiculo(String marca, double velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}
	
	
	public void mostrarInfo() {
		System.out.println("marca: " + marca);
		System.out.println("velocidad: " + velocidad + " km/h");
	}
	
	
	
}
