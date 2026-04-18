package Ejercicio1;



//herencia docente y estudiante heredan de persona
//metodos override mostrar
//casos de prueba 
////persona: mauro
/// estudiante 221701
/// docente: geografia 


public class Estudiante extends Persona{

	private String carnet;
	
	

	public Estudiante(String nombre, int edad, String carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}



	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		System.out.println("carnet: " + carnet);
	}
	
	
	
	
	
	
	
	
	
	
	
}
