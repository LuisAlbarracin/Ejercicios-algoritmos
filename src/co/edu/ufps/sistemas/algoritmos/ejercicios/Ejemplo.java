package co.edu.ufps.sistemas.algoritmos.ejercicios;

public class Ejemplo {
	
	
	public static void main(String[] args) {
		
		int[] arreglo = {1, 3, 7, 15, 19, 24, 31, 38, 40};
		int j = 0;
		int buscado = 19;
		
		while(arreglo[j] < buscado && j < 9)
			j = j + 1;
		
		if(arreglo[j] == buscado)
			System.out.println("Se encontró el valor");
		else
			System.out.println("Sorry no sorry");
	}

}
