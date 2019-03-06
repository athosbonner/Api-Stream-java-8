package com.br.stram;

import java.util.stream.Stream;

public class StreamBuilder {

	public static void main(String[] args) {
		
		Stream.Builder<String> useStreamBuilder = Stream.builder();
		
		Stream<String> useStream = useStreamBuilder.add("Capitã marvel").add("Avengers: Endgame").build();
		useStream.forEach(System.out::println);
		
	}

}
