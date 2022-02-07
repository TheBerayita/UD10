package Ej4.Interfaz;


import Ej4.Clases.*;
import javax.swing.JOptionPane;

public class pedirDatos {

	public static void menu() {
		System.out.println("-------MENU-------");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicacion");
		System.out.println("4: Potencia");
		System.out.println("5: Raiz Cuadrada");
		System.out.println("6: Raiz Cubica");
		System.out.println("7: Division");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opcion"));
		switch (opcion) {
		case 1:
			Operecion.suma();
			break;
		case 2:
			Operecion.resta();
			break;
		case 3:
			Operecion.multiplicar();
			break;
		case 4:
			Operecion.potencia();
			break;
		case 5:
			Operecion.raizCuadrada();
			break;
		case 6:
			Operecion.raizCubica();
			break;
		case 7:
			Operecion.dividir();
			break;
		default:
			break;
		}
	}

}
