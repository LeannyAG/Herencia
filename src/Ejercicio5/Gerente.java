package Ejercicio5;


//Herencia: gerente→ emlpleado
//Override: calcularSalario()
//Caso: salario + bono


public class Gerente extends Empleado {

	
	private double bonoAdicional;
	
	

	public Gerente(String nombre, double salario, double bonoAdicional) {
		super(nombre, salario);
		this.bonoAdicional = bonoAdicional;
	}



	@Override
	public double calcularSalario() {
		
		return super.calcularSalario() + bonoAdicional;
	}



	@Override
	public String toString() {
		return "Gerente [bonoAdicional=" + bonoAdicional + "]";
	}




	
	
	
	
	
	
	
	
	
}
