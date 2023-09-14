package proyectoBytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		// Variable          =  Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(400);
		// primeraCuenta.pais = "Colombia"
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(400);
		System.out.println(segundaCuenta.getSaldo());
		//System.out.println(primeraCuenta.agencia);
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
	}
}
