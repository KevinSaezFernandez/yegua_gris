package del_6_al_10;

import java.util.Scanner;

public class Ejercicio07 {

	/**
	 * Pide tres n�meros y los intercambie sin que ninguno coincida.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reciclar c�digo es algo muy habitual y que ahorra horas de trabajo
		//�ste c�digo es reciclado del Ejercicio 06
		
		int A, B, C, x;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero:");		A = keyboard.nextInt();
		System.out.print("Introduce el segundo n�mero:"); 		B = keyboard.nextInt();
		System.out.print("Introduce el tercer n�mero:"); 		C = keyboard.nextInt();
		x = A; 		A = B; 		B = C;		C = x;
		System.out.println("Y ahora... �el intercambio!");		System.out.println(A + " <-> " + B + " <-> " + C);
		
	}

}
