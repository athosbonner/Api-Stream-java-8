package com.br.stram;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		 
		 Stream<Integer> useStream1 = Stream.of(1,2,3,4,5);
         useStream1.forEach(p -> System.out.println(p)); 
			
			//ou
		
		 Stream<Integer> useStream2 = Stream.of(new Integer[] {1,2,3,4,5});
         useStream2.forEach(p -> System.out.println(p)); 


	}

}
