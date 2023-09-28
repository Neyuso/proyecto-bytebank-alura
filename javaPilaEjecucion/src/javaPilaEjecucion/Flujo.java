package javaPilaEjecucion;

public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	public static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}

	public static void metodo2() {
		System.out.println("Inicio metodo2");
		Cuenta cuenta = new Cuenta();
		throw new ArithmeticException();

}
