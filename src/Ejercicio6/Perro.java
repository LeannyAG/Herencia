package Ejercicio6;



//Herencia: perro → animal
//Override: hacerSonido()
//Caso: ladrido

public class Perro extends Animal {

	
	
	private String nombre;

	public Perro(String raza, String nombre) {
		super(raza);
		this.nombre = nombre;
	}

	@Override
	public void hacerSonido() {
		System.out.println("el perro hace GUAU GUAU!!");
		
	}

	@Override
	public void mostrar() {
		System.out.println("nombre: " + nombre);
		super.mostrar();
	}




	
	
	
	
	
	
	
}
