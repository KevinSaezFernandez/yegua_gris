package del_31_al_35;

import java.util.Scanner;

public class Ejercicio35 {

	/**
	 * Escribir un programa que lea exactamente 8 números y luego escriba la suma de todos los que se han tecleado en posiciones pares (el 2º,4º,6º y 8º)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int suma = 0, numero;
		for (int i = 1 ; i <= 8 ; i++){
			System.out.println("Introduce el " + i + "º número:");
			numero = keyboard.nextInt();
			if (i % 2 == 0){
				suma = suma + numero;
			}
		}
		System.out.println("La suma del 2º, 4º, 6º y 8º número es " + suma + ".");
	}

}
