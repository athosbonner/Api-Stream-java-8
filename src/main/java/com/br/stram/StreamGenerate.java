package com.br.stram;

import java.util.Date;
import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {
			
		 Stream<Date> useStream = Stream.generate(() -> 
		 		{ 
		 			return new Date(); 
		 		});
		 
		 useStream.forEach(p -> System.out.println(p));
	}

}
