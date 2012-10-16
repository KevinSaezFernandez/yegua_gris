package del_6_al_10;

import java.util.Scanner;

public class Ejercicio06 {

	/**
	 * .Pide dos números,los almacena, intercambia sus valores y los escribe.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B, x;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduce el primer número:");		A = keyboard.nextInt();
		System.out.print("Introduce el segundo número:"); 		B = keyboard.nextInt();
		x = A; 		A = B; 		B = x;
		//El ';' es final de comando: esto quiere decir que no es necesario escribir el la línea siguiente y se puede ahorrar espacio
		//Por convenio es mejor poner un comando por línea, para facilitar la comprensión del código, así como comentarios
		System.out.println("Y ahora... ¡el intercambio!");
		System.out.println(A + " <-> " + B);
	}

}
