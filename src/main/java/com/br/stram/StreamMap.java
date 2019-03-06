package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 * C�digo do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */

public class StreamMap {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<>();
		lista.add("Homem de Ferro");
		lista.add("Doutor Estranho");
		lista.add("Capit�o America");
		lista.add("Vi�va Negra");
		lista.add("Thor");
		
		Stream<String> stream = lista.stream();
		
		stream.filter((item) -> item.equals("Homem de Ferro")).map((item) ->{
			
			//Se esse for o home de ferro ent�o fa�a alguma coisa
			if (item.equals("Homem de Ferro")) {
				item += " - Esse � o Tony Stark";
			}
			
			//Retornando o dado tratado.
			return item;
			
			}).forEach(System.out::println);
		
	}

}
