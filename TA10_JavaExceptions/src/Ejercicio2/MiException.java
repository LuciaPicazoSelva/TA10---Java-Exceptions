package Ejercicio2;

public class MiException extends Exception{

	private static final long serialVersionUID = 1L; //Versión actual de mi clase

	//Constructor con mensaje explicativo
	public MiException () {
		super("Excepcion capturada con mensaje: Esto es un objeto Exception");
	}
}
