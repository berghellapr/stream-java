package ar.com.unpaz.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prueba1 {

	List<String> list = Arrays.asList("a", "b", "c", "d");
	Stream<String> stream = list.stream();
	
	Stream<String> filteredStream = stream.filter(s-> s.startsWith("a"));
	Stream<String> mappedStream = stream.map(String::toUpperCase);
	
	long count = stream.count(); //cuento los elementos
	
	List<String> list2 = stream.collect(Collectors.toList()); //convierte mi lista de stream en una lista convencional
	list2.forEach(System.out::println); // iterar sobre los elementos
	
	List<String> myList = Arrays.asList("apple","banana","cherry","date");
	List<String> result = myList.stream()
			.filter(s->s.startsWith("a"))
			.map(String::toUpperCase)
			.collect(Collectors.toList())
	
	System.out.println(result); //output: [APPLE]
	
	//-----------------------------------------------------------

}