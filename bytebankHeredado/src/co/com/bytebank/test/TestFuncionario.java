package co.com.bytebank.test;

import co.com.bytebank.modelo.Funcionario;
import co.com.bytebank.modelo.Contador;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);	
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
	
}
