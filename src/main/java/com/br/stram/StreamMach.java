package com.br.stram;

import java.util.ArrayList;
import java.util.List;
/**
 * C�digo do segundo post em blogathosbonner.wordpress.com
 * @author athos.da.c.marinho
 *
 */
public class StreamMach {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("HOMEM DE FERRO");
		
		boolean retorno = true;
		
		//Usando anyMatch, retorna true se item for iqual a HOMEN DE FERRO
		retorno = lista.stream().anyMatch((item)-> item.equals("HOMEM DE FERRO"));
		
		System.out.println(retorno);
		
		//Retorna true se item come�ar com a letra A
		retorno = lista.stream().allMatch((item) -> item.startsWith("A"));

		System.out.println(retorno);

		//Retorna true se o item n�o corresponder a condi��o.
		retorno = lista.stream().noneMatch((item)-> item.endsWith("g"));

		System.out.println(retorno);


	}

}
