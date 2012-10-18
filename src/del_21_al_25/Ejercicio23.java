package del_21_al_25;
import java.util.Scanner;

public class Ejercicio23 {

	/**
	 * Leer 10 números y decir cuántos son positivos.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, x = 0;
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0 ; i < 10 ; i++){
			System.out.println("Introduce un número:");
			n = keyboard.nextInt();
			if (n > 0){
				x = x + 1;
			}
		}
		System.out.println("Se han introducido " + x + " números positivos.");
	}

}
