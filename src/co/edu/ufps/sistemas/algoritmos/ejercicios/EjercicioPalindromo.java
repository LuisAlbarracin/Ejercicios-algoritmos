package co.edu.ufps.sistemas.algoritmos.ejercicios;

public class EjercicioPalindromo {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Escribir un algoritmo que indica si una palabra leida
		 * del teclado es un palindromo. Un palindromo es una
		 * palabra que se lee igual en ambos sentidos como
		 * radar
		 * 
		 * **/
		
		String palabra = "radar";
		int coincidencias = 0;
		
		for(int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i) == palabra.charAt(palabra.length()-1-i)) {
				coincidencias++;
			}
		}
		
		if(coincidencias == palabra.length())
			System.out.println(palabra + " es un palindromo");
		
	}
	
}
