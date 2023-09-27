package bytebankHeredado;

public abstract class Autenticable extends Funcionario{

	private String clave;
	
	public void setClave (String clave) {
		this.clave = clave;
	}
	
	public abstract boolean iniciarSesion (String clave);

}
