package bytebankHeredado;

public class Gerente extends Funcionario{

	private String clave;
	
	public void setClave (String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion (String clave) {
		return clave == "AluraCursosOnLine";
	}
	
	//Sobre-escritura de metodo
	public double getBonificacion ( ) {
		System.out.println("Ejecutando dese Gerente");
		return super.getSalario() + super.getBonificacion();
		}
}
