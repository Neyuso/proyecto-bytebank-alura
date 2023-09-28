package co.com.bytebank.test;

import co.com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {
	

	public CuentaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		super.saldo = 0.0;
		
	}

}
