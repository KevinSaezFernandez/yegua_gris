package del_6_al_10;

import java.util.Scanner;

public class Ejercicio07 {

	/**
	 * Pide tres números y los intercambie sin que ninguno coincida.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reciclar código es algo muy habitual y que ahorra horas de trabajo
		//Éste código es reciclado del Ejercicio 06
		
		int A, B, C, x;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduce el primer número:");		A = keyboard.nextInt();
		System.out.print("Introduce el segundo número:"); 		B = keyboard.nextInt();
		System.out.print("Introduce el tercer número:"); 		C = keyboard.nextInt();
		x = A; 		A = B; 		B = C;		C = x;
		System.out.println("Y ahora... ¡el intercambio!");		System.out.println(A + " <-> " + B + " <-> " + C);
		
	}

}
