package proyectoBytebank;

public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("45444332");
		diego.setTelefono("999922222");
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.setAgencia(1);
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.titular.getDocumento());
		System.out.println(cuentaDeDiego.titular);
		System.out.println(diego);
	}

}
