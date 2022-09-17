package Electrodomestico;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase=100.0;
		this.color="Blanco";
		this.consumoEnergetico='F';
		this.peso=5.6;
	}
	
	//Constructor por defecto menos el precio y el peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
	}
	
	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase=precioBase;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.peso=peso;
	}
	
	//Métodos get de todos los atributos
	public double getPrecioBase() {
		return precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public double getPeso() {
		return peso;
	}
	
	//Método para comprobar que el carácter de consumo energético es el correcto
	final public char comprobarConsumoEnergetico(char letra) {
		if ((letra=='A')||(letra=='B')||(letra=='C')||(letra=='D')||(letra=='E')||(letra=='F')) {
			return letra; //Si la letra se encuentra entre la A y la F, se devolverá la letra en sí
		} else {
			return 'F'; //Si no se encuentra entre la A y la F, se devolverá el carácter por defecto 'F'
		}
	}
	
	//Método cálculo precio final según el consumo energético y el peso del electrodomestico
	public double precioFinal() {
		double precioFinal = 0.0;
		switch(consumoEnergetico) { //Primero calculamos el precio según el consumo energético
			case 'A':
				precioFinal=precioFinal + 100;
				break;
			case 'B':
				precioFinal=precioFinal + 80;
				break;
			case 'C':
				precioFinal=precioFinal + 60;
				break;
			case 'D':
				precioFinal=precioFinal + 50;
				break;
			case 'E':
				precioFinal=precioFinal + 30;
				break;
			case 'F':
				precioFinal=precioFinal + 10;
				break;
		}
		
		if (peso<20) { //Finalizamos el cálculo del precio según el peso 
			precioFinal=precioFinal + 10;
		} else if((20<=peso)&(peso<50)){ //Diferentes rangos de peso
			precioFinal=precioFinal + 50;
		} else if((50<=peso)&(peso<80)){
			precioFinal=precioFinal + 80;
		} else if (peso>80) {
			precioFinal=precioFinal + 100;
		} else {
			precioFinal=precioFinal + 0; //En el caso de que el precio fuese incorrecto
		}
		return precioFinal;
	}
	
	
	//Método para comprobar qur el color es el correcto
	final public String comprobarColor (String color) {
		if ((color.toLowerCase()=="blanco")||(color.toLowerCase()=="negro")||(color.toLowerCase()=="rojo")||(color.toLowerCase()=="azul")||(color.toLowerCase()=="gris")) {
			return color; //Si el color se encuentra entre los que hay disponibles, se devolverá el color en sí
		} else {
			return "blanco"; //Si no se encuentra entre los colores, se devolverá la cadena por defecto "blanco"
		}
	}
	
	
	//Clase Main para realizar la comprobación de los constructores
	public static void main(String[] args) {
		
		//Ejercicio TA9-Herencia en Java
		
		Electrodomestico array[] = new Electrodomestico[10]; //Creación de array con 10 posiciones
		array[0]=new Lavadora(); //Asignación de un objeto a cada posición
		array[1]=new Lavadora(104.7); 
		array[2]=new Lavadora(600.7,408.8);
		array[3]=new Lavadora(244.9);
		array[4]=new Lavadora(400.0);
		array[5]=new Television();
		array[6]=new Television(709.8,450.0);
		array[7]=new Television(100.0,"azul",'A',500.0,127,true);
		array[8]=new Television();
		array[9]=new Television(600.0,409.8);
		
		
		double lavadoras[] = new double[10]; //Creación de array lavadoras con 5 posiciones
		double televisiones[] = new double[10]; //Creación de array televisiones con 5 posiciones
		double sumaLavadoras=0.0, sumaTelevisiones=0.0, total=0.0;
		int j=0;
		
		for (int i=0;i<10;i++) {
			if (array[i] instanceof Lavadora) {
				lavadoras[i]=array[i].precioFinal(); //Recorro el array y realizo el método precioFinal()
			} else if (array[i] instanceof Television) {
				televisiones[j]=array[i].precioFinal(); //Recorro el array y realizo el método precioFinal()
				j++;
			}
		}
		
		System.out.println("El precio de las lavadoras son: "); 
		for (int i=0;i<5;i++) {
			sumaLavadoras = sumaLavadoras + lavadoras[i];
			System.out.println(lavadoras[i]);
		}
		System.out.println("La suma total del precio de Lavadoras es " + sumaLavadoras);
		System.out.println("El precio de las televisiones son: "); 
		for (int i=0;i<5;i++) {
			sumaTelevisiones = sumaTelevisiones + televisiones[i];
			System.out.println(televisiones[i]);
		}	
		total=sumaLavadoras+sumaTelevisiones;
		
		System.out.println("La suma total del precio de Televisiones es " + sumaTelevisiones);
		System.out.println("La suma total del precio de todos los Electrodomesticos es " + total);
	}
}

