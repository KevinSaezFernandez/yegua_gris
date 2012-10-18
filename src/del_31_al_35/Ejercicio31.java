package del_31_al_35;

public class Ejercicio31 {

	/**
	 * Escribir las tablas de multiplicar del 1 al 10.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bucle doble: suelen usarse este tipo de estructuras para recorrer matrices
		//Para ir mostrando la idea, he incluido por encima cómo se tabularía para que quede encuadrado (ver salida en consola)
		for (int i = 1 ; i <= 10 ; i++){
			System.out.print("Tabla del " + i);
			if (i < 10){
				System.out.print(" ");
			}
			System.out.print("->|");
			for(int j = 1; j <= 10 ; j++){
				if (i * j < 100){
					System.out.print(" ");
				}
				if (i * j < 10){
					System.out.print(" ");
				}
				System.out.print((i * j) + "|");
			}
			System.out.println();
		}
	}

}
