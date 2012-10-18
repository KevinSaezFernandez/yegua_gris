package del_31_al_35;

import java.util.Scanner;

public class Ejercicio32 {

	/**
	 * Leer números por teclado hasta que la suma de los pares sea mayor que 1.000 e imprimir el resultado de esa suma.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0, numero = 0;
		Scanner keyboard = new Scanner(System.in);
		while (suma < 999){
			System.out.println("Introduce un número:");
			numero = keyboard.nextInt();
			if (numero % 2 == 0){
				suma = suma + numero;
			}
		}
		System.out.println("La suma de pares total es " + suma + ".");
	}

}
