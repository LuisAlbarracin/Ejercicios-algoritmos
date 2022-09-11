package co.edu.ufps.sistemas.algoritmos.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * Diseñar un algoritmo que calcule el número de
		 * veces que una cadena de caracteres aparece como
		 * subcadena de otra cadena. Por ejemplo, abc aparece
		 * dos veces en la cadena abcdabc y la cadena
		 * aba aparece dos veces en la cadena ababa
		 * 
		 * **/
		
		String cadena = "abcdabc";
		String subcadena = "abc";
		int aparece = 0;
		
		if(cadena.length() >= subcadena.length()) {
			for(int i = 0; i < cadena.length() - (subcadena.length()-1); i++) {
				int contador = 0;
				for(int j = 0; j < subcadena.length(); j++) {
					if(cadena.charAt(i+j) == subcadena.charAt(j))
						contador++;
				}
				if(contador == subcadena.length())
					aparece++;
			}
			System.out.println("La subcadena aparece: " + aparece + " veces");
		}else {
			System.out.println("La subcadena es mayor a la cadena");
		}
		
		
	}

}
