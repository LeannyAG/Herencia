package Ejercicio9;



//Herencia:  LibroDigital herencia libro
//Método: mostrarInfo()
//Caso: título + MB

public class LibroDigital extends Libro{

	private int mb;

	
	
	
	public LibroDigital(String titulo, String autor, int mb) {
		super(titulo, autor);
		this.mb = mb;
	}




	@Override
	public void mostrarInfo() {
		System.out.println("taman:  " + mb + "MB");
		super.mostrarInfo();
	}

	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
