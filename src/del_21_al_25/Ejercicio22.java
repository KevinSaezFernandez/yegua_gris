package del_21_al_25;

import java.util.Scanner;

public class Ejercicio22 {

	/**
	 * Escribe los N primeros n�meros pares empezando por uno dado por el usuario.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un n�mero:");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		System.out.println("Introduce el n�mero de saltos pares:");
		int salto = keyboard.nextInt();
		System.out.println(salto + " saltos a partir del n�mero " + numero + ".");
		
		if (numero % 2 == 0){
			for (int i = 0; i < salto; i ++){
				System.out.println(numero);
				numero = numero + 2;
			}
		}else{
			numero = numero + 1;
			for (int i = 0; i < salto; i ++){
				System.out.println(numero);
				numero = numero + 2;
			}
		}
	}

}
