package co.com.bytebank.test;

import java.util.ArrayList;

import co.com.bytebank.modelo.*;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		
		lista.add(cc);
		lista.add(cc2);
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		// Por cada cuenta : lita
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
	
}
