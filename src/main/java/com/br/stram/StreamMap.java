package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 * Código do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */

public class StreamMap {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<>();
		lista.add("Homem de Ferro");
		lista.add("Doutor Estranho");
		lista.add("Capitão America");
		lista.add("Viúva Negra");
		lista.add("Thor");
		
		Stream<String> stream = lista.stream();
		
		stream.filter((item) -> item.equals("Homem de Ferro")).map((item) ->{
			
			//Se esse for o home de ferro então faça alguma coisa
			if (item.equals("Homem de Ferro")) {
				item += " - Esse é o Tony Stark";
			}
			
			//Retornando o dado tratado.
			return item;
			
			}).forEach(System.out::println);
		
	}

}
