package del_6_al_10;

import java.util.Scanner;

public class Ejercicio08 {

	/**
	 * .Lee una cantidad entera de euros y la desglosa en billetes de 10, 5 y monedas de 1 euro, preferentemente en ese orden.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Introduce el dinero a cambiar:");
		int dinero = input.nextInt();
		int i = 0;
		while (dinero >= 10) { //Las condiciones en todos los bucles y condicionales deben expresarse en forma de booleanos y deben ir entre paréntesis
			dinero -= 10; //Esto decrementa la variable en 10; esta manera simplifica las operaciones de suma y resta
			i += 1; //También se puede usar otra variable o incluso la misma variable
		}
		System.out.println(i + " X 10€");
		i = 0;
		while (dinero >= 5){
			dinero -= 5;
			i += 1;
		}
		System.out.println(i + " X 5€");
		i = 0;
		while (dinero >= 1){dinero -= 1;i += 1;} //Se pueden poner los bucles de esta manera, pero no resulta muy legible; en este caso ahorra algo de espacio al tratarse de dos operraciones solamente
		System.out.println(i + " X 1€");
	}

}
