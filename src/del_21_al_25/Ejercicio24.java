package del_21_al_25;

import java.util.Scanner;

public class Ejercicio24 {

	/**
	 * Programa que lee la nota de 5 alumnos e indica cuantos están aprobados.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, x = 0;
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0 ; i < 5 ; i++){
			System.out.println("Introduce la nota:");
			n = keyboard.nextInt();
			if (n > 0){
				x = x + 1;
			}
		}
		System.out.println("Han aprobado " + x + " alumnos.");
	}

}
