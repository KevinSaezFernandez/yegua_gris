package del_1_al_5;

import java.util.Scanner;

public class Ejercicio05 {

	/**
	 * Pide tres números ,calcula la media y la escribe.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int uno, dos, tres, resultado = 0; //Es posible definir varias variables de un tirón con la misma linea, e incluso inicializarlas siempre y cuando sea con el mismo valor
		Scanner entrada = new Scanner(System.in); //No es necesario definir un buffer de entrada cada vez que se pida una entrada por teclado, y si se hace hay que asegurarse de darle un nombre diferente, como si de una variable se tratara
		System.out.print("Introduce el primer número:");
		uno = entrada.nextInt();
		System.out.print("Introduce el segundo número:");
		dos = entrada.nextInt();
		System.out.print("Introduce el tercer número:");
		tres = entrada.nextInt();
		resultado = (uno + dos + tres)/3; //Esto es una asignación con operación: los operadores * y / tienen prioridad sobre los demás operadores aritméticos
		//Este código es optimizable, ya que la variable 'resultado no es necesaria'
		System.out.print("La media es " + resultado);
		
	}

}
