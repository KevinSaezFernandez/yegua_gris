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
		System.out.print("Introduce un n�mero:");
		int numero = entrada.nextInt(); //Se crea la variable de tipo Entero; si se lee por teclado otra cosa que no sea un entero se producir� un error!
		//Para poder asignar la entrada a la variable de ser convertida al mismo tipo: esto se llama parsear. Cada tipo de variable tiene su propio 'Parse'
		System.out.print("El resultado de " + numero + "+ 10 es " + (numero + 10));
		//El System.out permite realizar operaci�nes aritm�ticas dentro de par�ntesis; si no se ponen los par�ntesis lo concatenar�a como si de dos cadenas diferentes se tratara
	}

}
