package javaPilaEjecucion;

public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fin main");
	}

	public static void metodo1() throws MiException {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}

	public static void metodo2() throws MiException {
		System.out.println("Inicio metodo2");
		throw new MiException("Mi excepcion fue lanzada");
	}
}
