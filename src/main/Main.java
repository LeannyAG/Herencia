package main;


import java.time.LocalDate;

import Ejemplo.CuentaAhorro;
import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.*; 
import Ejercicio4.*;
import Ejercicio5.*;
import Ejercicio6.*;
import Ejercicio7.*;
import Ejercicio8.*;
import Ejercicio9.*;


public class Main {
	
	public static void  main (String [] args) {
		
		System.out.println("ejemplo ");
		CuentaAhorro cuenta = new CuentaAhorro(1000, 0.05 );
		
		 System.out.println("Saldo: " + cuenta.getSaldo());
		
			System.out.println();

			
		
		System.out.println("EJERCICIO1");
	Docente d = new Docente ("mauro ", 34, "geografia");
	Estudiante e = new Estudiante("lourdes", 21, "221701");
	
	System.out.println("DOCENTE: ");
	d.mostrar();
	
	
	System.out.println("ESTUDIANTE: ");
	e.mostrar();
	
	
	System.out.println();
	
	
	
	
	System.out.println("EJERCICIO2");

	CuentaCorriente c1 = new CuentaCorriente(1000, 500);
	
	System.out.println("saldo inicial : "+ c1.getSaldo());
	
	System.out.println("retirando 1400...." );
	c1.retirar(1400);
	
	System.out.println("nuevo saldo "+ c1.getSaldo() + (c1.getSaldo() < 0 ? "(sobregiro de dinero)" : ""));
	
	System.out.println();

	
	
	
	
	System.out.println("EJERCICIO3");
	
	ProductoPerecedero  p1 = new ProductoPerecedero("leche", 25.50, LocalDate.of(2025, 12, 7) );

      p1.mostrar();
	
	System.out.println();
	
	
	
	
	
	System.out.println("EJERCICIO4");
	
	Bus b = new Bus(20, " R 6");
	
	b.mostrar();
	
	System.out.println();
	
	
	
	
	
	System.out.println("EJERCICIO5");
	
	Gerente g = new Gerente("oscar ", 8000, 500);
	
   double total = g.calcularSalario();
   System.out.println("el salario mas el bono aplicado es:  " + total);
   
	
   System.out.println();
   
   
   
   
   System.out.println("EJERCICIO6");
   
   Perro p = new Perro( " golden retriver ", "foxy" );
  p.mostrar();
   
   System.out.println("sonido detectado");
   
   p.hacerSonido();
   
	
   
   
   System.out.println();
	
	
   
   System.out.println("EJERCICIO7");
	
   Moto m = new Moto("Ducati", 335, 450);
   
   m.mostrarInfo();
	
   System.out.println();
   
   
   
   
   System.out.println("EJERCICIO8");
   
   Rectangulo r1 = new Rectangulo( 5,3);
   Circulo c = new Circulo( 5);
   
   r1.calcularArea();
   c.calcularArea();
   
   System.out.println();
   
	
	
	
	
   System.out.println("EJERCICIO9");
	
	
	LibroDigital l1 = new LibroDigital("Wool ", " Hugh Howey", 4 );
	
	l1.mostrarInfo();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
