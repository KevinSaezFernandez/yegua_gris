package del_21_al_25;

import java.util.Scanner;

public class Ejercicio21 {

	/**
	 * Escribe los 20 siguientes números pares empezando por uno dado por el usuario.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un número:");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		System.out.println(numero);
		
		if (numero % 2 == 0){
			for (int i = 0; i < 20; i ++){
				System.out.println(numero);
				numero = numero + 2;
			}
		}else{
			numero = numero + 1;
			for (int i = 0; i < 20; i ++){
				System.out.println(numero);
				numero = numero + 2;
			}
		}
	}
}
