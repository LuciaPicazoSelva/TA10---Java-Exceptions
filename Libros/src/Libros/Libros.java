package Libros;

public class Libros {
	protected String ISBN;
	protected String titulo;
	protected String autor;
	protected int numeroPaginas;
	
	public Libros(String titulo, String ISBN, String autor, int numeroPaginas) {
		this.titulo=titulo;
		this.ISBN=ISBN;
		this.autor=autor;
		this.numeroPaginas=numeroPaginas;
	}
	
	//Métodos get y set de cada atributo
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setISNB(String ISBN) {
		this.ISBN=ISBN;
	}
	public String getISBN() {
		return ISBN;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas=numeroPaginas;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	//Método toString() para mostrar información relativa al libro
	public String toString() { 
		return "El libro " + titulo +  " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numeroPaginas + " paginas" ;
	}
	
	//Aplicación ejecutable
	public static void main(String[] args) {
		//Creación de 2 objetis Libros
		Libros libro1 = new Libros("'Memorias de Idhun'", "'9788467502695'", "'Laura Gallego'", 556);
		Libros libro2 = new Libros("'El valle de los lobos'", "'9788467539677'", "'Laura Gallego'", 271);
		
		//Muestro por pantalla los objetos creados anteriormente 
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		if (libro1.getNumeroPaginas()>libro2.getNumeroPaginas()) {
			System.out.println("El primer libro " + libro1.getTitulo() + " tiene mas paginas que el segundo libro " + libro2.getTitulo());
		} else {
			System.out.println("El segundo libro " + libro2.getTitulo() + " tiene mas paginas que el primer libro " + libro1.getTitulo());
		}
		
	}
	
}
