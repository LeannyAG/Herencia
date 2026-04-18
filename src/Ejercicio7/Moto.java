package Ejercicio7;


//Herencia: moto  → vehivulo
//Método: mostrarInfo()
//Caso: marca + cilindrada

public class Moto extends Vehiculo{

	private int cilindrada;
	

	public Moto(String marca, double velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}


	@Override
	public void mostrarInfo() {
		System.out.println("cilindrada: " + cilindrada);
		super.mostrarInfo();
	}
	
	

	
	
	
	
	
	
}
