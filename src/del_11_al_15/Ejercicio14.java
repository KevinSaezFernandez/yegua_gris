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
				continue;//Esta instrucción hace que se salga de esta iteración, saltando a la siguiente. Importante incrementar el iterador ANTES de salir o caerá en bucle infinito
			}
			System.out.println("Introduce el " + i + "º número:");
			suma = suma + numero.nextInt();
			i ++; //Incrementa el iterador en 1; sólo se puede usar esta instrucción en bucles For y Do While
		}while(i <= 5);
		//La principal característica de este tipo de bucle es que se ejecuta almenos una vez
		System.out.println("La suma total es " + suma);
	}

}
