package ar.com.unpaz.ejercicio;
import ar.com.unpaz.model.*;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio {
	
	/* Método 1: filtrar y transformar una lista de números: dada una lista de números enteros,
	 * filtrar los números pares, eleva cada número par al cuadrado y recopila los resultados
	 * en una nueva lista. */
    public static List<Integer> filtrarYTransformar(List<Integer> numeros) {
        return numeros.stream()
                      .filter(num -> num % 2 == 0)
                      .map(num -> num * num)
                      .collect(Collectors.toList());
    }

	/* Método 2: filtrar y contar palabras: dada una lista de palabras, filtrar las palabras
	 * que tienen mas de 3 caracteres y convertirlas a minusculas. Contar cuantas
	 * palabras cumplen esta condicion. */
    public static long filtrarYContarPalabras(List<String> palabras) {
        return palabras.stream()
                       .filter(palabra -> palabra.length() > 3)
                       .map(String::toLowerCase)
                       .count();
    }

    /* Método 3: calcular la suma de las edades de personas: dada una lista de objetos Persona
	 * con atributos nombre y edad, filtra las personas mayores de 18 años y calcula la suma 
	 * de sus edades. */
    public static int sumarEdades(List<Persona> personas) {
        return personas.stream()
                       .filter(persona -> persona.getEdad() > 18)
                       .mapToInt(Persona::getEdad)
                       .sum();
    }
}
