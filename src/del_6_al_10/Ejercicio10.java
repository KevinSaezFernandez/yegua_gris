package del_6_al_10;

import java.util.Scanner;

public class Ejercicio10 {

	/**
	 * Lee dos números y después escribe el mayor.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reciclaje del Ejercicio 09
		Scanner dato = new Scanner(System.in);
		System.out.print("Introduce el primer número:");
		int primero = dato.nextInt();
		System.out.print("Introduce el segundo número:");
		int segundo = dato.nextInt();
		
		if (primero == segundo){
			System.out.print("Son iguales...  (-.-)U");
		}else
			if (primero > segundo){
				System.out.println(primero + " es el mayor.");
			}else
				System.out.println(segundo + " es el mayor.");
	}

}
