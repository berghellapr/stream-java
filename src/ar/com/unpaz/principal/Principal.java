package ar.com.unpaz.principal;

import ar.com.unpaz.ejercicio.Ejercicio;
import ar.com.unpaz.model.*;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
    	
        // implementando método 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> resultado1 = Ejercicio.filtrarYTransformar(numeros);
        System.out.println("Numeros pares al cuadrado: " + resultado1);

        // implementando método 2
        List<String> palabras = Arrays.asList("ejemplo", "de", "palabras", "mas", "tres");
        long resultado2 = Ejercicio.filtrarYContarPalabras(palabras);
        System.out.println("Número de palabras con más de 3 caracteres: " + resultado2);

        // implementando método 3
        List<Persona> personas = Arrays.asList(
            new Persona("Juan", 20),
            new Persona("Luis", 15),
            new Persona("Pedro", 30)
        );
        int resultado3 = Ejercicio.sumarEdades(personas);
        System.out.println("Suma de edades de personas mayores de 18: " + resultado3);
    }
}