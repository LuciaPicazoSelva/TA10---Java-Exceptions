package Ejercicio3;

public class ExceptionParImpar extends Exception{

	private static final long serialVersionUID = 1L;//Versión actual de mi clase 
	private int numero;
	
	//Constructor por defecto
	public ExceptionParImpar() {
		super();
	}
	
	//Constructor pasando un atributo por parámetro
	public ExceptionParImpar(int numero) {
		super();
		this.numero=numero;
	}
	
	//Sobreescribe al método getMessage() de la clase Exception
	@Override
	public String getMessage() {
		if(numero % 2 == 0) {
			return "Es par";
		} else {
			return "Es impar";
		}
	}
}
