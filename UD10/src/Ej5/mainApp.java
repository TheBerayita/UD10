package Ej5;

import javax.swing.*;

public class mainApp {
	public static void main(String[] args) throws Exception {
		try {
			String texto = JOptionPane.showInputDialog("Introduce un tamaño para el array");
			int numero = Integer.parseInt(texto);

			texto = JOptionPane.showInputDialog("Introduce la longitud del password");
			int longitud = Integer.parseInt(texto);
			if (numero <= 0 || longitud <= 0) {
				Exception e = new Exception("Introduce numeros positivos");
				throw e;
			}

			Password listaPassword[] = new Password[numero];
			boolean fortalezaPassword[] = new boolean[numero];

			for (int i = 0; i < listaPassword.length; i++) {
				listaPassword[i] = new Password(longitud);
				fortalezaPassword[i] = listaPassword[i].esFuerte();
				System.out.println(listaPassword[i].getContraseña() + " " + fortalezaPassword[i]);
			}
		} catch (NumberFormatException ex) {
			System.out.println("Solo numeros");
		} catch (NegativeArraySizeException ex) {
			System.out.println("Longitud de array negativa");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
