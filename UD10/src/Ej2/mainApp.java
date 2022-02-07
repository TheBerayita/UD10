package Ej2;

public class mainApp {

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			Exception ex = new Exception("Esto es un objeto Exception");
			throw ex;
		} catch (Exception ex) {
			System.out.println("Excepcion capturada con mensaje: " + ex.getMessage());
		}finally {
		System.out.println("Programa terminado");
		}
	}
}
