package Electrodomestico;

public class Lavadora extends Electrodomestico{
	private double carga;
	
	//Constructor por defecto
	public Lavadora() {
		super();
		//Constante
		this.carga=5;
	}

	//Constructor con todos los atributos por defecto menos el precio y el peso
	public Lavadora (double precio, double peso) {
		super(precio, peso);
	}
	
	//Constructor con todos los atributos por defecto menos la carga
	public Lavadora(double carga) {
		super();
		this.carga=carga;
	}
	
	//Método get de carga
	public double getCarga() {
		return carga;
	}
	
	//Método precio final sobreescrito de la clase 
	@Override
	public double precioFinal() {
		if (carga>30) {
			return (super.precioFinal()+50); //Si la carga es superior a 30 kg, al precio final que habíamos calculado en la clase padre se le sumarán 50 euros
		} else {
			return (super.precioFinal()); //Si la carga es inferior a 30 kg, el precio final sería el mismo que el que habíamos calculado en la clase padre
		}
		
	}

}
