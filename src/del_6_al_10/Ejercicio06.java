package del_6_al_10;

import java.util.Scanner;

public class Ejercicio06 {

	/**
	 * .Pide dos n�meros,los almacena, intercambia sus valores y los escribe.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B, x;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero:");		A = keyboard.nextInt();
		System.out.print("Introduce el segundo n�mero:"); 		B = keyboard.nextInt();
		x = A; 		A = B; 		B = x;
		//El ';' es final de comando: esto quiere decir que no es necesario escribir el la l�nea siguiente y se puede ahorrar espacio
		//Por convenio es mejor poner un comando por l�nea, para facilitar la comprensi�n del c�digo, as� como comentarios
		System.out.println("Y ahora... �el intercambio!");
		System.out.println(A + " <-> " + B);
	}

}
