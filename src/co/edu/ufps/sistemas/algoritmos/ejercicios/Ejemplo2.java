package co.edu.ufps.sistemas.algoritmos.ejercicios;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		boolean[] tabulador = new boolean[9];
		
		for(int i=0; i<tabulador.length; i++) {
			int val = (int)(Math.random()*10);
			if(val <= 5)
				tabulador[i] = true;
		}
		
		for(int i=0; i<tabulador.length; i++) {
			if(tabulador[i])
				System.out.println("Operación verdadera");
		}
		
	}

}
