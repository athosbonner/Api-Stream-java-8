package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		//Somando todos os valores da lista.
		Optional<Integer> reduced = lista.stream().reduce((s1,s2) -> s1 + s2);
		
		//Imprimindo se for satisfatória
		reduced.ifPresent(System.out::println);
		
	}

}
