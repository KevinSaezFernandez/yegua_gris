package del_11_al_15;

import java.util.Scanner;

public class Ejercicio15 {

	/**
	 * Leer por teclado 4 n�meros;despu�s de leer cada n�mero debe mostrar la suma parcial de los n�meros leidos hasta el momento y cuando lea los cuatro mostrar� la suma total.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reciclaje de c�digo: Ejercicio 14
		Scanner numero = new Scanner(System.in);
		int suma = 0;
		int i = 1;
		do{
			System.out.println("Introduce el " + i + "� n�mero:");
			suma = suma + numero.nextInt();
			System.out.println("Suma parcial: " + suma);
			i ++; 
		}while(i < 4);
		System.out.println("Introduce el " + i + "� n�mero:");
		suma = suma + numero.nextInt();
		System.out.println("La suma total es " + suma);
	}

}
