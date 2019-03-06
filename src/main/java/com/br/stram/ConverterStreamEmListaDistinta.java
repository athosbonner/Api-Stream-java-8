package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Código do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */

public class ConverterStreamEmListaDistinta {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(4);
		
		Stream<Integer> stream = lista.stream();
		
		//Converendo Stream em lista sem repetidos 
		List<Integer> listaSemRepetidos = stream.distinct().collect(Collectors.toList());
		//Imprimindo todos os dados da lista.
		listaSemRepetidos.forEach(System.out::println);
		
		
	}

}
