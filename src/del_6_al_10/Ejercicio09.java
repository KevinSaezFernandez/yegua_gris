package del_6_al_10;

import java.util.Scanner;

public class Ejercicio09 {

	/**
	 *  Lee dos números y escribe el mayor seguido del menor.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.print("Introduce el primer número:");
		int primero = dato.nextInt();
		System.out.print("Introduce el segundo número:");
		int segundo = dato.nextInt();
		
		if (primero == segundo){ //Para comparar con operandos se debe usar el == o de lo contrario no funcionará ya que lo tomará como una asignación
			System.out.print("Son iguales...  (-.-)U");
		}else
			if (primero > segundo){
				System.out.println(primero + " es mayor que " + segundo);
			}else
				System.out.println(segundo + " es mayor que " + primero);
		//Esta es la estructura If/Else de Java, y no se puede poner de otra forma
		//Cuando se está programando en Java es altamente recomendable tener el código bien indentado para tener la mayor claridad y orden posibles
		//Hay que tener, también, un control de las llaves que se abren y cierran o el código fallará
	}

}
