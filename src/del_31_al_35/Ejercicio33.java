package del_31_al_35;

import java.util.Scanner;

public class Ejercicio33 {

	/**
	 * Programa que calcula la suma de los N primeros números primos.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el número de números primos a sumar:");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		while (numero < 0){
			System.out.println("Error. Introduce un entero positivo:");
			numero = keyboard.nextInt();
		}
		int suma = 3;
		if (numero == 0){
			System.out.println("La suma es 0.");
		}
		if (numero == 1){
			System.out.println("La suma es 1.");
		}
		if (numero == 2){
			System.out.println("La suma es 3.");
		}
		if (numero > 2){
			int serie = 3;
			numero = numero - 2;
			boolean primo = true;
			while (numero > 0){
				primo = true;
				for (int i = 2 ; i < serie ; i++){
					if (serie % i == 0){
						primo = false;
					}
				}
				if (primo){
					suma = suma + serie;
					numero = numero - 1;
					serie = serie + 1;
				}else
					serie = serie + 1;
			}
			System.out.println("La suma es " + suma + ".");
		}
		
	}

}
