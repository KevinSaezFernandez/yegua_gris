package del_1_al_5;
import java.util.*; //Para poder usar el Scanner hay que importar esta biblioteca

public class Ejercicio02 {

	/**
	 * Pide el nombre y lo devuelve
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se define un buffer de lectura de tipo Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu nombre:");
		System.out.println(""); //Esto hace que salte una línea sin escribir nada en consola
		String nombre = entrada.next(); //Se define una variable tipo String y se inicializa con el valor introducido por teclado
		//Este comando es el que dispara el evento de entrada
		System.out.print("Bienvenido, " + nombre);
		//Un System.out puede imprimir variables y varias cadenas diferentes mediante la concatenación con '+'
	}

}
