package del_16_al_20;

import java.util.Scanner;

public class Ejercicio16 {

	/**
	 * Lee por teclado un n�mero y escribe el factorial.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Existen dos maneras de hacer este ejercicio: en flujo normal con un bucle o recursivamente con una funci�n
		//Dado que el concepto de recursividad es algo m�s avanzado, se har� con un bucle
		
		System.out.print("Introduce un n�mero:");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		int factorial = numero;
		if ((numero == 0) || (numero == 1)){
			System.out.println("El factorial es 1.");
		}else{//Cuando un Else tiene varias sentencias, debe usarse un {} o de lo contrario s�lo ejecutar� la primera
			while(numero > 1){
				factorial = factorial * (numero - 1);
				numero = numero - 1;
			}
			System.out.println("El factorial es " + factorial + ".");
		}
	}

}
