package del_26_al_30;

import java.util.Scanner;

public class Ejercicio28 {

	/**
	 * Programa que diga si un número es primo.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el número:");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		while (numero < 1){
			System.out.println("Error: número no válido. Introduzca un valor entero positivo:");
			numero = keyboard.nextInt();
		}
		if ((numero == 1) || (numero == 2)){
			numero = 3;
		}
		boolean primo = true; //Tipo de dato Boolean: sólo aceptan valores 'true' o 'false'; al ser booleanos, se pueden usar como condiciones en los bucles
		for (int i = 2 ; i < numero; i ++){
			if (numero % i == 0){
				primo = false;
			}
		}
		if (primo){ // Esto eslo mismo que decir 'Si primo es true...'[If (primo == true)]; en este caso el valor de primo se tiene controlado, por lo que puedo permitirme usarlo así
			System.out.println("Es primo.");
		}else
			System.out.println("No es primo.");
	}

}
