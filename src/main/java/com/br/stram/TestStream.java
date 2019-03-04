package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Homem de Ferro");
		lista.add("Capitão America");
		lista.add("Doutor Estranho");
		
		 Stream<String> usandoStream = lista.stream();
		 usandoStream.forEach(p -> System.out.println(p));		
		
	}

}
