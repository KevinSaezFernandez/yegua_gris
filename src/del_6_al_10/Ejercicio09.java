package del_6_al_10;

import java.util.Scanner;

public class Ejercicio09 {

	/**
	 *  Lee dos n�meros y escribe el mayor seguido del menor.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero:");
		int primero = dato.nextInt();
		System.out.print("Introduce el segundo n�mero:");
		int segundo = dato.nextInt();
		
		if (primero == segundo){ //Para comparar con operandos se debe usar el == o de lo contrario no funcionar� ya que lo tomar� como una asignaci�n
			System.out.print("Son iguales...  (-.-)U");
		}else
			if (primero > segundo){
				System.out.println(primero + " es mayor que " + segundo);
			}else
				System.out.println(segundo + " es mayor que " + primero);
		//Esta es la estructura If/Else de Java, y no se puede poner de otra forma
		//Cuando se est� programando en Java es altamente recomendable tener el c�digo bien indentado para tener la mayor claridad y orden posibles
		//Hay que tener, tambi�n, un control de las llaves que se abren y cierran o el c�digo fallar�
	}

}
