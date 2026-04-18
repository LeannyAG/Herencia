package Ejercicio1;








/*
//Herencia:
// Extiende Persona

//Override:
// mostrar()

//Caso de prueba:
//Docente con especialidad = geografia
*/

public class Docente extends Persona{

	private String especialidad;

	
	

	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}




	public String getEspecialidad() {
		return especialidad;
	}




	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}




	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		System.out.println("especialidad:  " + especialidad);
	}
	
	
	

	
	
	
	








	
	
}
