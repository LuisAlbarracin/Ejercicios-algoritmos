package co.edu.ufps.sistemas.algoritmos.ejercicios;

public class EjercicioPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * Diseñar un algoritmo para determinar si un número n
		 * es primo. Un número es primo sólo puede ser divisible
		 * por el mismo y por la unidad
		 *  
		 **/
		
		int numero = 5;
		boolean primo = true;
		
		for(int i=2; i <= numero/2; i++) {
			if(numero % i == 0) {
				primo = false;
				break;
			}
		}
		
		if(primo)
			System.out.println("El número " + numero + " es primo");

	}

}
