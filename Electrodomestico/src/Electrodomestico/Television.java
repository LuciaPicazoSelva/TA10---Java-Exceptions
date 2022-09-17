package Electrodomestico;

public class Television extends Electrodomestico {
	private double resolucion;
	private boolean sintonizadorTDT;
	
	//Constructor por defecto
	public Television() {
		super();
		this.resolucion=20.0;
		this.sintonizadorTDT=false;
	}
	
	//Constructor con todos los atributos por defecto menos el precio y el peso
	public Television (double precio, double peso) {
		super(precio, peso);
	}
	
	//Constructor con todos los atributos, incluso los heredados
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	//Métodos get
	public double getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//Método precio final sobreescrito de la clase 
	@Override
	public double precioFinal() {
		double precioFinal=super.precioFinal();
		if (resolucion>40.0) {	//Si la resolución es superior a 40 pulgadas, se le sumará un 30% al precio final
			precioFinal=precioFinal + 0.3*precioFinal;
			if (sintonizadorTDT) { //Si la TV tiene incluido el sintonizador, al precio final se le sumarán 50 euros 
				precioFinal=precioFinal+50;
			} 
		} //Si no cumple una y/o ninguna de estas condiciones, el precio final de la clase padre no variará
		return precioFinal;
	}	
}
