package del_11_al_15;

import java.util.Scanner;

public class Ejercicio12 {

	/**
	 * Lee una nota numérica (por ejemplo,7) y escribe la nota literal (por ejemplo,NOTABLE).
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nota = new Scanner(System.in);
		System.out.print("Introduce la nota:");
		int calificacion = nota.nextInt();
		//Estructura Switch: se le pasa una variable como parámetro y revisa cada caso que se le pida
		//Se diferencia de una estructura If en que mira valores concretos y no booleanos
		switch (calificacion){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.print("Insuficiente.");
			break;
			//Cada caso debe acabar con un break o de lo contrario seguirá el flujo de ejecución normalmente
			//Por ejemplo, aquí ejecuta el código desde 1 hasta 4
		case 5:
		case 6:
			System.out.print("Suficiente.");
			break;
		case 7:
		case 8:
			System.out.print("Notable.");
			break;
		case 9:
		case 10:
			System.out.print("Sobresaliente.");
			break;
		default:
			System.out.print("Error.");	
		}
		//Como se puede observar, depende de la pericia del programador si es mejor usar una estuctura If anidada, un bucle o un Switch
		//Es contraproducente un switch con demasiados casos, se recomienda filtar las opciones con If y luego pasar una lista más reducida por el Switch, a no se que no se pueda (por ejemplo, si todas las opciones son diferentes)
		//Una estructura If ensucia más el código que un Switch, depende de cada uno decidir qué estructura es mejor
		
	}

}
