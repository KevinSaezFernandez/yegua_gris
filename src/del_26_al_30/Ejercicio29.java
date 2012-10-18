package del_26_al_30;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio29 {

	/**
	 * Programa que nos permite cinco jugadas para acertar un número almacenado internamente y que cada vez nos dice si es mayor o menor o que se ha adivinado.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Random aleatorio = new Random(); //Clase Random: genera un número pseudo aleatorio dentro del rango del tipo de variable que se le pase
		int numero = aleatorio.nextInt();
		
		if (numero < 0)
			numero = numero * -1; //Al ser de tipo entero, puede dar un valor negativo
		while (numero >= 10){
			numero = numero / 10; // Cuando se dividen datos de tipo Int se hace división entera, es decir, se trunca la parte entera (truncar es omitir, no redondear)
		}
		int intentos = 1, prueba;
		System.out.println("Adivina el número secreto entre 1 y 10:");
		while (intentos < 6){
			prueba = keyboard.nextInt();
			if (prueba == numero){
				System.out.println("¡Correcto! Lo has conseguido en el " + intentos + "º intento.");
				intentos = 6;
			}else{
				intentos = intentos + 1;
				if (6-intentos > 0){
					System.out.println("Incorrecto, prueba otra vez (te quedan " + (6-intentos ) + " intentos):");
				}
			}
		}
		if (intentos < 6){
			System.out.println("El número secreto era el " + numero + ".");
		}
	}
}
