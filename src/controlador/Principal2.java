package controlador;

import modelo.Hucha;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hucha huchaAna = new Hucha(400.00, "Ana");
		
		huchaAna.meterDinero(200.00);
		

		
		huchaAna.setPropietario("Paqui");
		
		System.out.println(huchaAna.getPropietario());
		
		huchaAna.doblarSaldo();
		
		System.out.println(huchaAna.doblarSaldo2());
		
		

	}

}
