package bytebankHeredado;

public class Contador extends Funcionario{

	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Contador");
		return 200;
	}
	
}
