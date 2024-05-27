package ar.com.unpaz.ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio1 {

	/* Filtrar y transformar una lista de numeros: dada una lista de numeros enteros,
	 * filtrar los numeros pares, eleva cada numero par al cuadrado y recopila los resultados
	 * en una nueva lista. */
	
	List<Integer> listaEnteros = Arrays.asList(1,2,3,4,5);
	Stream<Integer> stream = listaEnteros.stream();
	
	//Stream<Integer> filteredEnteros = stream.filter();
}
