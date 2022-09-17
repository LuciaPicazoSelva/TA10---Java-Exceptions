package Serie;

public class Serie implements Entregable {
	protected String titulo;
	protected int numeroTemporadas;
	protected Boolean entregado;
	protected String genero;
	protected String creador;
	protected boolean prestado;
	

	//Constructor por defecto
	public Serie(){
		this.numeroTemporadas=3;
		this.entregado=false;
	}
	
	//Constructor con atributos por defecto menos el titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	
	//Constructor con todos los atributos menos entregado
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo=titulo;
		this.numeroTemporadas=numeroTemporadas;
		this.genero=genero;
		this.creador=creador;
	}
	
	//Métodos get y set de todos los atributos menos de entregado
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	public void setNumeroTemporadas(int numero) {
		this.numeroTemporadas=numero;
	}
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador=creador;
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + ", numero de temporadas: " + numeroTemporadas + ", genero: " + genero + "y creador: " + creador;
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
	
	//Método que compara el número de temporadas
	public int compareTo (Object a) {
		Serie obj = (Serie)a;
		int numeroTemporadasObjeto, max=0;
		numeroTemporadasObjeto=obj.getNumeroTemporadas();//Obtenemos el número de temporadas del objeto 
														 //introducido por parámetro

		if(numeroTemporadasObjeto>numeroTemporadas) {//Comparamos el numero de temporadas 
			max=numeroTemporadasObjeto;
		}else {
			max=numeroTemporadas;
		} 
		return max;//Devolvemos el numero del objeto que mayor temporadas tiene
	}
	
	//Aplicación ejecutable
	public static void main(String[] args) {
		Serie arraySeries[]=new Serie[5]; //Array de 5 posiciones	
		
		arraySeries[0]=new Serie("Bob esponja", 3, "Dibujos animados", "Stephen Hillenburg"); //Creación de 5 objetos con diferentes constructores
		arraySeries[1]=new Serie("Big Bang Theory", 19, "Science", "Georges Lemaître");
		arraySeries[2]=new Serie("La que se avecina", 11, "Comedia de situacion","Alberto Caballero");
		arraySeries[3]=new Serie("Las supernenas", 5, "Dibujos animados", "Craig McCracken");
		arraySeries[4]=new Serie("Pokemon", 12, "Dibujos animados", " Satoshi Tajiri");
		
		//Entrega algunas Series
		arraySeries[0].entregar();
		arraySeries[3].entregar();
		
		//Comprobación cuántos Videojuegos son entregados
		int cantidad=0;
		for (int i=0;i<5;i++) {
			if (arraySeries[i].isEntregado()) {
				cantidad++;
			}
		}
		System.out.println("Hay " + cantidad + " series entregadas");
		
		//Serie con más temporadas
		int max = 0, numero = 0, contmax=0;
		Serie maxObj=new Serie();//Creamos un objeto en el guardaremos el objeto con mayor numero de temporadas
		for (int i = 0; i<(arraySeries.length-1); i++) {
			numero = arraySeries[i].compareTo(arraySeries[i+1]);//Comparamos entre sí todos los objetos del array
			if (numero>max) { //Si el número obtenido de la comparación, es mayor que el que obtuvimos de
							  //de la comparación anterior, este será el mayor número hasta el momento
				max=numero;
				contmax=i+1;
				maxObj=arraySeries[contmax];//Guardamos el objeto con mayor número de temporadas para poder
											//mostrarlo por pantalla al final del programa
			}
		}
		//Utilizo el método toString para mostrar por pantalla la información del objeto con más temporadas
		System.out.println(maxObj.toString());
		
	}

}
