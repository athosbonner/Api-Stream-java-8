package com.br.stram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Código do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */

public class ConverterStreamEmLista {

	public static void main(String[] args) {
		
		
		List<Integer> lista = new ArrayList<>();
		
		//Convertendo lista para Stream 
		Stream<Integer> stream = lista.stream();
		
		//Convertendo Stream em Lista
		List<Integer> convertendoParaLista = stream.collect(Collectors.toList());
		
		System.out.println(convertendoParaLista);
		
		
	}

}
 