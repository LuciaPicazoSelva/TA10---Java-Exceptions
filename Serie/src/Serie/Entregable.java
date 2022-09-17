package Serie;

public interface Entregable {
	
	//Métodos abstractos de la interfaz para poner en común cosas de las clases "Serie" y "Videojuego"
	public void entregar();
	
	public void devolver();
	
	public boolean isEntregado();
	
	public int compareTo (Object a);
}
