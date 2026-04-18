package Ejercicio4;


//Herencia:Bus → BusTransporte 
//Método: descripcion()
//Caso: ruta + capacidad

public class Bus extends Transporte {
	
	

	protected String ruta;
	
	

	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}



	@Override
	public void mostrar() {
     System.out.println("ruta: " + ruta);

		super.mostrar();
	}
	
	
	
	
	
	

}
