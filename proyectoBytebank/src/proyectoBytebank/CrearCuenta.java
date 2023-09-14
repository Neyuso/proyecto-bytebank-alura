package proyectoBytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		// primeraCuenta.pais = "Colombia"
		System.out.println(primeraCuenta.saldo);
	}
}
