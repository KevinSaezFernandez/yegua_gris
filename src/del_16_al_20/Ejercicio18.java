package del_16_al_20;

import java.util.Scanner;

public class Ejercicio18 {

	/**
	 * Pide tres veces un número y dice cada vez si es positivo, negativo o nulo.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cifra = new Scanner(System.in);
		int numero = 0, i = 0;
		while (i < 3){
			System.out.print("Introduce el número:");
			numero = cifra.nextInt();
			if (numero > 0){
				System.out.println("Es positivo.");
			}else if (numero < 0){
				System.out.println("Es negativo.");
			}else
				System.out.println("Es nulo.");
			i += 1;
		}
		
	}

}
