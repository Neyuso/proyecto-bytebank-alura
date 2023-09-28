package co.com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable{
	
	//Sobre-escritura de metodo
	public double getBonificacion ( ) {
		System.out.println("Ejecutando dese Gerente");
		return 2000;
		}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
