package co.com.bytebank.modelo;

/*
 * 
 */
//
/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente
 * 
 * @version 1.0
 * @author neybe
 */

public abstract class Cuenta{
	
	// public // Accesible desde cualquier parte
	// --default // Accesible dentro del paquete
	// ---protected // default + clases hijas
	// -----private // solo desde la misma clase
	
	protected double saldo;
	private int agencia =1;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total;
	
	/**
	 * Instancia una nueva cuenta usando agencia y numero
	 * @param agencia
	 * @param numero
	 */

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	    System.out.println("Estoy creando una cuenta " + numero);
		Cuenta.total++;
	}
	
	public abstract void depositar(double valor);
	
	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error
	 * lanza una excepcion
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (this.saldo <= valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
	    if (this.saldo >= valor) {
	        try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
	        cuenta.depositar(valor);
	        return true;
	    }
	return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No se permiten valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	} 
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
    @Override
    public String toString() {
        String cuenta = "Numero: " + this.numero + ", Agencia:" + this.agencia;
        return cuenta;
    }
}
	