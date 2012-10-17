package del_11_al_15;

import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * Lee un número y escribe si es positivo, negativo o nulo.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.print("Introduce el número:");
		int numero = dato.nextInt();
				
		if (numero > 0){
			System.out.println(numero + " es positivo.");
		}else if (numero < 0){
			System.out.println(numero + " es negativo.");
		}else
			System.out.print("Es nulo.");
		}

}
