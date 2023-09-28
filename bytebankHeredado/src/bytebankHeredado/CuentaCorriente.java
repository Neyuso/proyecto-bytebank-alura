package bytebankHeredado;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double valor) {
		double comision = 0.2;
		try {
			super.retirar(valor + comision);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
}
