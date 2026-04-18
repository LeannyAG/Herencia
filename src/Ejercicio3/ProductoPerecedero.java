package Ejercicio3;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
	
	private LocalDate fechaVencimiento;
	
	

	public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
		super(nombre, precio);
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	public boolean estaVencido() {
		return LocalDate.now().isAfter(fechaVencimiento);
		
	}


	@Override
	public void mostrar() {
		
		super.mostrar();
		System.out.println("fecha de vencimiento: " + fechaVencimiento);
		
		if(estaVencido()) {
			System.out.println("producto vencido");
		}else {
			System.out.println("producto bueno " );
		}
	}
	
	
	

	
	
	
	

	

	
	

	
	
	
	
	
	
	
	
	
	
	
	

	}
	
	
	
	
	
	
	
	
	

