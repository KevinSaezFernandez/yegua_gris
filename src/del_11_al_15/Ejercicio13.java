package del_11_al_15;

import java.util.Scanner;

public class Ejercicio13 {

	/**
	 * Lee tres n�meros ,halla la suma y los escribe ordenados ascendentemente.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dato = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero:");
		int primero = dato.nextInt();
		System.out.print("Introduce el segundo n�mero:");
		int segundo = dato.nextInt();
		System.out.print("Introduce el tercer n�mero:");
		int tercero = dato.nextInt();
		
		if ((primero < segundo) && (primero < tercero)){//Operador booleano &&: es el AND 
			if(segundo < tercero){
				System.out.println(primero + ", " + segundo + ", " + tercero);
			}else
				System.out.println(primero + ", " + tercero + ", " + segundo);
				
		}else
			if ((primero > segundo) && (primero > tercero)){
				if (segundo > tercero){
					System.out.println(tercero + ", " + segundo + ", " + primero);
				}else
					System.out.println(segundo + ", " + tercero + ", " + primero);
			}else
				if (segundo < tercero){
					System.out.println(segundo + ", " + primero + ", " + tercero);
				}else
					System.out.println(tercero + ", " + primero + ", " + segundo);
	}
	//Existen m�s operadores booleanos, como el OR (||) y el not (!)

}
