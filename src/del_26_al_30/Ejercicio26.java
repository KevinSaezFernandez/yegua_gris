package del_26_al_30;

import java.util.Scanner;

public class Ejercicio26 {

	/**
	 * Programa que lee n�meros enteros hasta que se introduce 99 (centinela), que no se tiene en cuenta. El programa al final escribe la suma de los n�meros introducidos positivos y la media de los mismos.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0, media = 0;
		System.out.println("Introduce un n�mero:");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		
		while (numero != 99){ //Operador binario != : significa distinto; esto se lee "Mientras 'numero' sea DISTINTO de '99'..."
			total = total + numero;
			media = media + 1;
			System.out.println("Introduce un n�mero:");
			numero = keyboard.nextInt();
		}
		if (media < 1){
			System.out.println("Sin sumas no hay media...");
		}else{
			System.out.println("La suma total de los " + media + " n�meros es " + total + ".");
			System.out.println("La media de los " + media + " n�meros es " + (total/media) + ".");
		}
	}

}
