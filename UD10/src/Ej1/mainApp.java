package Ej1;

import java.util.*;

public class mainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//hola

		int numero = (int) (Math.random() * 500);
		int contador = 0;
		int intentos = 0;
		do {
			boolean visto;
			do {
				System.out.println("Introduzca un contador (1-500)");
				try {
					intentos++;
					contador = scanner.nextInt();
					visto = true;
				} catch (InputMismatchException ex) {
					System.out.println("No ha introducido un contador entero");
					scanner.next();
					visto = false;
				}
			} while (visto == false);
			if (contador > numero) {
				System.out.println("El numero es menor. Sigue intentando");

			}
			if (contador < numero) {
				System.out.println("El numero es mayor. Sigue intentandolo");
			}

		} while (contador != numero);

		System.out.println("Correcto, el numero es:"+ numero+" y lo has hecho en: "+ intentos);
	}
}
