package del_26_al_30;

import java.util.Scanner;

public class Ejercicio27 {

	/**
	 * Programa que lee n�meros enteros hasta que su suma es mayor que 100, escribe por pantalla el menor y el mayor.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un n�mero:");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt(), suma = 0, mayor = 0, menor = 0;
		
		if (numero > 99){
			System.out.println("Menor que 100 si no te importa...");
			mayor = 100;
			menor = -1;
		}else{
			mayor = numero;
			menor = numero;
			suma = suma + numero;
		}
		while (suma < 100){
			System.out.println("Introduce un n�mero:");
			numero = keyboard.nextInt();
			if (numero > 99){
				System.out.println("Menor que 100 si no te importa...");
			}else {
				suma = suma + numero;
				if (mayor < numero){
				mayor = numero;
			}
			if (menor > numero){
				menor = numero;
			}
			}
			
		}
			System.out.println("La suma total es " + suma + "; el n�mero m�s alto introducido ha sido el " + mayor + " y el m�s bajo el " + menor + ".");
	}

}
