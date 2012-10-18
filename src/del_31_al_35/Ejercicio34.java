package del_31_al_35;

import java.util.Scanner;

public class Ejercicio34 {

	/**
	 * Escribir un programa que lea números enteros indefinidamente hasta que llegue el número 0 y escriba la suma.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0, numero = 0;
		boolean fin = false;
		Scanner keyboard = new Scanner(System.in);
		while (fin == false){
			System.out.println("Introduce un número:");
			numero = keyboard.nextInt();
			suma = suma + numero;
			if (numero == 0){
				fin = true;
			}
		}
		System.out.println("La suma total es " + suma + ".");
	}

}
