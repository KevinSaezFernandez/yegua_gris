package del_11_al_15;

import java.util.Scanner;

public class Ejercicio14 {

	/**
	 * Leer por teclado 5 numeros y escribir la suma.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);
		int suma = 0;
		int i = 0;
				//Estructura Do While: el iterador se define fuera
		do{
			if (i == 0){
				i ++;
				continue;//Esta instrucci�n hace que se salga de esta iteraci�n, saltando a la siguiente. Importante incrementar el iterador ANTES de salir o caer� en bucle infinito
			}
			System.out.println("Introduce el " + i + "� n�mero:");
			suma = suma + numero.nextInt();
			i ++; //Incrementa el iterador en 1; s�lo se puede usar esta instrucci�n en bucles For y Do While
		}while(i <= 5);
		//La principal caracter�stica de este tipo de bucle es que se ejecuta almenos una vez
		System.out.println("La suma total es " + suma);
	}

}
