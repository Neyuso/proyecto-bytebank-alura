package bytebankHeredado;

public class Gerente extends Autenticable{
	
	//Sobre-escritura de metodo
	public double getBonificacion ( ) {
		System.out.println("Ejecutando dese Gerente");
		return 2000;
		}
}
