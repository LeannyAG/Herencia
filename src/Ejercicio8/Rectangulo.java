package Ejercicio8;

public class Rectangulo extends Figura {

	
	//Herencia: rectangulo herencia figura
	//Override: calcularArea()
	//Caso: base*altura 
	
	private double base;
	private double altura;
	
	
	
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}




	@Override
	public void calcularArea() {
		System.out.println("el area de un rectangulo es:  " + (base * altura));
		super.calcularArea();
	}
	
	
	
	
	
	
}
