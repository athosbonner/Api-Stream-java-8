package com.br.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.br.stram.cliente.Cliente;

public class MetodosStream {

	public static void main(String[] args) {
				
		List<Cliente> lista = new ArrayList<>();
		
		//--------------------- sum()
//		double stream = lista.stream()
//				.filter(item-> item.getNacionalidade().equals("Brasileiro"))
//				.mapToInt(item-> item.getIdade()).sum();
				
		//--------------------- Min()
//		double stream = lista.stream()
//				.filter(item-> item.getNacionalidade().equals("Brasileiro"))
//				.mapToInt(item-> item.getIdade()).min().getAsInt();
		
		//--------------------- Max()
//		double stream = lista.stream()
//				.filter(item-> item.getNacionalidade().equals("Brasileiro"))
//				.mapToInt(item-> item.getIdade()).max().getAsInt();
		
		
		//---------------------Count()
		double stream = lista.stream()
				.filter(item-> item.getNacionalidade().equals("Brasileiro"))
				.mapToInt(item-> item.getIdade()).count();
		
		
	}

}
