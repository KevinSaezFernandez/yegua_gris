package del_26_al_30;

import java.util.Scanner;

public class Ejercicio30 {

	/**
	 * Simular un reloj digital:por ejemplo 08:23:30.
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido al reloj digital.");
		System.out.println("Por favor, inicalize el reloj con la hora actual exacta:");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Horas: ");
		int horas = keyboard.nextInt();
		System.out.print("Minutos: ");
		int minutos = keyboard.nextInt();
		System.out.print("Segundos: ");
		int segundos = keyboard.nextInt();
		System.out.println();
		
		while (((horas > 23) || (horas < 0)) || ((minutos > 59) || (minutos < 0)) || ((segundos > 59) || (segundos < 0))){
			System.out.println("Error: la hora introducida debe estar entre 00:00:00 y 23:59:59.");
			System.out.println("Por favor, inicalize el reloj con la hora actual exacta:");
			System.out.print("Horas: ");
			horas = keyboard.nextInt();
			System.out.print("Minutos: ");
			minutos = keyboard.nextInt();
			System.out.print("Segundos: ");
			segundos = keyboard.nextInt();
			System.out.println();
		}
		while (true){ //Bucle infinito; cualquier código puesto después de este bucle será considerado como error por el compilador ya que es un código inalcanzable
			for (int i = 0; i < 10; i++){ //Dado que no existe un comando en eclipse que limpie la pantalla de la consola, hago que imprima 10 retornos de carro
				System.out.println();
			}
			System.out.println("Son las " + horas + ":" + minutos + ":" + segundos + ". Que tenga un buen día.");
			//No hay manera de formatear las variables para que salgan como 00, 01, etc. Sólo se podría conseguir con una cadena de condicionales que imprimieran un 0 en caso de que la variable sea menor que 10
			Thread.sleep(999); //Comando que detiene la ejecución de los hilos (en este caso, 1) durante x milisegundos
			segundos = segundos + 1;
			if (segundos > 59){
				segundos = 0;
				minutos = minutos + 1;
			}
			if (minutos > 59){
				minutos = 0;
				horas = horas + 1;
			}
			if (horas > 23){
				horas = 0;
			}
		}
	}
}
