package bytebankHeredado;

public class ControlBonificacion {

	private double suma;
	
	public double registraSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
}
