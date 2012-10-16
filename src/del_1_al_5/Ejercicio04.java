package del_1_al_5;
import java.util.*;

public class Ejercicio04 {

	/**
	 * Lee un numero, le suma 10 y lo escribe.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número:");
		int numero = entrada.nextInt(); //Se crea la variable de tipo Entero; si se lee por teclado otra cosa que no sea un entero se producirá un error!
		//Para poder asignar la entrada a la variable de ser convertida al mismo tipo: esto se llama parsear. Cada tipo de variable tiene su propio 'Parse'
		System.out.print("El resultado de " + numero + "+ 10 es " + (numero + 10));
		//El System.out permite realizar operaciónes aritméticas dentro de paréntesis; si no se ponen los paréntesis lo concatenaría como si de dos cadenas diferentes se tratara
	}

}
