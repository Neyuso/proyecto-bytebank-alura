package co.com.bytebank.test;

import java.lang.String;

public class TestString {

	public static void main(String[] args) {
		java.lang.String nombre = "Alura";
		//No empleada en el mundo real
		//String nombre2 = new String("Alura");
		
		System.out.println("Antes de replace: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		char letra = nombre.charAt(5);
		int indice = nombre.indexOf("r");
		System.out.println("Despues de replace: " + nombre);
		System.out.println("Caracter encontrado; " + letra);
		System.out.println("Indice encontrado; " + indice);
		System.out.println();
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor.toString());
	}
	
}
