package Ejercicio2;

public class Cuenta {

	protected double saldo;
	
	
	

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	
	
	public void retirar(double monto) {
		if(monto <= saldo) {
			monto -= saldo;
			System.out.println("retiro exitoso DE "+ monto + " saldo actual" + saldo);
		}else {
			System.out.println("saldo insuficiente  DEL MONTO "+ monto);
		}
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
}
