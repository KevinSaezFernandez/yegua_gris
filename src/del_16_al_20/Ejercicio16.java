package del_16_al_20;

import java.util.Scanner;

public class Ejercicio16 {

	/**
	 * Lee por teclado un número y escribe el factorial.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Existen dos maneras de hacer este ejercicio: en flujo normal con un bucle o recursivamente con una función
		//Dado que el concepto de recursividad es algo más avanzado, se hará con un bucle
		
		System.out.print("Introduce un número:");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		int factorial = numero;
		if ((numero == 0) || (numero == 1)){
			System.out.println("El factorial es 1.");
		}else{//Cuando un Else tiene varias sentencias, debe usarse un {} o de lo contrario sólo ejecutará la primera
			while(numero > 1){
				factorial = factorial * (numero - 1);
				numero = numero - 1;
			}
			System.out.println("El factorial es " + factorial + ".");
		}
	}

}
