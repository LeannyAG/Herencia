package Ejemplo;

public class Cuenta {

	
	protected double saldo;
	
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public void retirar(double monto) {
		if(monto <= saldo) {
			saldo -=  monto;
		}else {
			System.out.println("saldo insuficiente");
		}
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	

	
}
