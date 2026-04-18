package Ejercicio8;

public class Circulo extends Figura{

	
	
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	
	
	
	
	@Override
	public void calcularArea() {
		double area = Math.PI * radio * radio;
		System.out.println("el area de un circulo es: " + area);
		super.calcularArea();
	}
	
	
	
	
	
	
	
}
