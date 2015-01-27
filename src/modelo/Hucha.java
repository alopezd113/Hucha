package modelo;

public class Hucha {
	
	private double saldo;
	private String propietario;
	
public String getSaldo() {
		String cadena = "tienes " + saldo + " euros";
		return cadena;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	
	
	public Hucha(double dinero, String nombre){
		
		saldo = dinero;
		propietario = nombre;
		
	}
	
	public void meterDinero(double cantidad) {
		saldo = saldo + cantidad;
		System.out.println("Has metido " + cantidad + " euros y ahora tienes " + saldo + " euros");
		
	}
	
	public void doblarSaldo () {
		saldo = saldo * 2;
		System.out.println("ahora tienes " + saldo + " euros.");
	}
	
	public double doblarSaldo2() {
		return saldo * 2;
	}
	

}
