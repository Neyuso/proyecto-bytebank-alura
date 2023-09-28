package co.com.bytebank.test;
import co.com.bytebank.modelo.*;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(200);
		try {
			cuenta.retirar(210);
			cuenta.retirar(10);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

	}
	
}
