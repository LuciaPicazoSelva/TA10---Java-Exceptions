package Ejercicio2;

public class Main extends MiException {
	
	private static final long serialVersionUID = 1L; //Versión actual de mi clase 

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new MiException();
		}catch(MiException e) {
			System.out.println(e);
		}finally {
			System.out.println("Programa terminado");
		}
	}
}
