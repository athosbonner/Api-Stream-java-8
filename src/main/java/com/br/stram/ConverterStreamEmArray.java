package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 * Código do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */

public class ConverterStreamEmArray {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		Stream<Integer> stream = lista.stream();
		
		//Convetendo Stream em Array com a classe toArray passando o tipo do array.
		Integer[] convetendoStreamEmArray = stream.toArray(Integer[]::new);
		
		System.out.println(convetendoStreamEmArray);
		
	}

}
