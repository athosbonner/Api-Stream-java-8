package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 * C�digo do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */
public class StreamSorted {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Homem de Ferro");
		lista.add("Doutor Estranho");
		lista.add("Capit�o America");
		lista.add("Vi�va Negra");
		lista.add("Thor");
		
		Stream<String> stream = lista.stream();
		
		stream.sorted().map(String::toUpperCase).forEach(System.out::println);
		
		
		
	}

}
