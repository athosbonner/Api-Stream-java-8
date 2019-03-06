package com.br.stram;

import java.util.ArrayList;
import java.util.List;

/**
 * Código do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */
public class StreamCount {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("HOMEM DE FERRO");
		lista.add("HOMEM DE FERRO");
		lista.add("HOMEM DE FERRO");
		
		long resultado = lista.stream().filter((item) -> item.equals("HOMEM DE FERRO")).count();

		System.out.println(resultado);

	}

}
