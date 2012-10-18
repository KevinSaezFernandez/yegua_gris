package del_21_al_25;

public class Ejercicio25 {

	/**
	 * Programa que calcula y escribe la suma y el producto de los 10 primeros números naturales.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0, producto = 1;
		for (int i = 1 ; i <= 10 ; i++){
			suma = suma + i;
			producto = producto * i;
			System.out.println("Suma del " + i + "º: " + suma + " // Producto del " + i + "º: " + producto);
		}
	}

}
