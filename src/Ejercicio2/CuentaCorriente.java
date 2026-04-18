package Ejercicio2;





//Herencia: Cuenta → CuentaCorriente
//Override: retirar()
//Caso: prueba de sobregiro





public class CuentaCorriente extends Cuenta {


protected double LimiteSobregiro;
	





public CuentaCorriente(double saldo, double limiteSobregiro) {
	super(saldo);
	LimiteSobregiro = limiteSobregiro;
}








@Override
public void retirar(double monto) {
	if(monto <= (saldo + LimiteSobregiro)) {
		saldo -= monto;
		System.out.println("retiro exitoso:  " + monto + "saldo actual:  " + saldo );
	}else {
		System.out.println("error sobregiro");
	}
	
}










	
}
