package Serie;

public class Videojuego implements Entregable{
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compania;
	protected boolean prestado;
	
	//Constructor por defecto
	public Videojuego(){
		this.horasEstimadas=10;
		this.entregado=false;
	}
	
	//Constructor con atributos por defecto menos el titulo y horas estimadas
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
	}
	
	//Constructor con todos los atributos menos entregado
	public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compania=compania;
	}
	
	//Métodos get y set de todos los atributos menos de entregado
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimados(int horasEstimadas) {
		this.horasEstimadas=horasEstimadas;
	}
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania=compania;
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + ", horas estimadas: " + horasEstimadas + ", entregado: " + entregado + ", genero: " + genero + " y compania: " + compania;
	}
	
	//Método que cambia el atributo prestado a true
	public void entregar() {
		prestado=true;
	}
	
	//Método que cambia el atributo prestado a false
	public void devolver() {
		prestado=false;
	}
	
	//Método que devuelve el estado del atributo prestado
	public boolean isEntregado() {
		return prestado;
	}
	
	//Método que compara las horas estimadas
	public int compareTo (Object a) {
		Videojuego obj = (Videojuego)a;
		int numeroHorasObjeto, max=0;
		numeroHorasObjeto=obj.getHorasEstimadas();//Obtenemos el número de horas del objeto 
												  //introducido por parámetro

		if(numeroHorasObjeto>horasEstimadas) {//Comparamos el numero de horas
			max=numeroHorasObjeto;
		}else {
			max=horasEstimadas;
		} 
		return max;//Devolvemos el número del objeto que mayor horas tiene
	}
	
	//Aplicación ejecutable
	public static void main(String[] args) {
		Videojuego arrayVideojuegos[]=new Videojuego[5]; //Array de 5 posiciones	
		
		arrayVideojuegos[0]=new Videojuego(); //Creación de 5 objetos con diferentes constructores
		arrayVideojuegos[1]=new Videojuego("LOL", 504);
		arrayVideojuegos[2]=new Videojuego("Call of Duty", 103, true, "Disparos", "Activision");
		arrayVideojuegos[3]=new Videojuego("Clash Royal", 245, false, "Estrategia", "Supercell" );
		arrayVideojuegos[4]=new Videojuego("Pokemon GO", 30);
		
		//Entregar algunos Videojuegos
		arrayVideojuegos[1].entregar();
		arrayVideojuegos[2].entregar();
		
		//Comprobación cuántos Videojuegos son entregados
		int cantidad=0;
		for (int i=0;i<5;i++) {
			if (arrayVideojuegos[i].isEntregado()) {
				cantidad++;
			}
		}
		System.out.println("Hay " + cantidad + " videojuegos entregados");
		
		//Videojuego con más horas estimadas
		int max = 0, numero = 0, contmax=0;
		Videojuego maxObj=new Videojuego();//Creamos un objeto en el guardaremos el objeto con mayor número de horas
		for (int i = 0; i<(arrayVideojuegos.length-1); i++) {
			numero = arrayVideojuegos[i].compareTo(arrayVideojuegos[i+1]);//Comparamos entre sí todos los objetos del array
			if (numero>max) { //Si el número obtenido de la comparación, es mayor que el que obtuvimos de
							  //de la comparación anterior, este será el mayor número hasta el momento
				max=numero;
				contmax=i+1;
				maxObj=arrayVideojuegos[contmax];//Guardamos el objeto con mayor número de horas estimadas
											     //para poder mostrarlo por pantalla al final del programa
			}
		}
		//Utilizo el método toString para mostrar por pantalla la información del objeto con más horas
		System.out.println(maxObj.toString());	
		
	}

}
