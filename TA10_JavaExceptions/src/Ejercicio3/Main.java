package Ejercicio3;

public class Main extends ExceptionParImpar{

	private static final long serialVersionUID = 1L; //Versión actual de mi clase 

	public static void main(String[] args) {
		
		System.out.println("Generando numero aleatorio...");
		//Obtener un numero aleatorio entre 0 y 999
		int numeroAleatorio = (int)(Math.random()*1000+1);
		System.out.println("El numero aleatorio generado es: " + numeroAleatorio);
		try {	
		    throw new ExceptionParImpar(numeroAleatorio);
		 } catch(ExceptionParImpar e) {
		    System.out.println(e.getMessage());
		 } 
	}
}
