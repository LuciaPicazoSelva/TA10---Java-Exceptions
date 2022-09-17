package Ejercicio5;

import java.util.concurrent.ThreadLocalRandom;

public class Password {

	private int longitud;
	private String contrasena;
	
	
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
	}
	
	//Constructor con longitud pasada por parámetro
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrasena=generarPassword(longitud);
	}
	
	public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // Establecemos los límites de nuestra contraseña (sumamos 1 para el límite superior)
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
	}
	
	//Generación de contraseña aleatoria pasando por parámetro la longitud introducida por el usuario
	private static String generarPassword(int longitud) {
		// Los carácteres entre los que se podrá elegir para generar la contraseña
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String contrasena = "";
        //Creación de la contraseña hasta los 8 carácteres
        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, caracteres.length() - 1);
            char caracterAleatorio = caracteres.charAt(indiceAleatorio);//Coge un carácter aleatorio según el
            														    //tamaño de la contraseña
            contrasena += caracterAleatorio;//Añade un nuevo carácter a la contraseña
        }
        return contrasena;
	}
	
	//Método para saber si la contraseña es fuerte o no según unas condiciones 
	private boolean esFuerte(String contrasena) {
		char caracter;
		int mayusculas=0, minusculas=0, numeros=0;
		for (int i = 0; i < contrasena.length(); i++) {
			caracter = contrasena.charAt(i);//Extraigo la contraseña caracter por caracter
            if(Character.isUpperCase(caracter)){//Compruebo cuántas mayúsculas contiene  
                mayusculas++;         
            }else if (Character.isLowerCase(caracter)){//Compruebo cuántas minúsculas contiene               
                minusculas++;
            }else {//Compruebo cuántos números contiene  
            	numeros++;
            }  
        }
		if ((mayusculas>=2)&(minusculas>=1)&(numeros>=5)) {
			return true;
		}else {
			return false;//Si la contraseña no tiene más de 2 mayúsculas, más de 1 minúscula y más de 5 números
		}
	}
	

	//Métodos get y set
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud=longitud;
	}
	
	
	public String getContrasena() {
		return contrasena;
	}
	
	
	//Clase Main para realizar la comprobación de los constructores
	public static void main(String[] args) {
		//Creación de array de Passwords
		Password arrayPasswords[] = new Password[10]; //El array tiene un tamaño de 10 posiciones
		boolean arrayBoolean[] = new boolean[10];
		
		System.out.println("La longitud de los Passwords debe ser de 8");
		
		//Bucle de creación de un objeto por cada posición del array
		for(int i=0;i<arrayPasswords.length;i++) {
			Password objeto=new Password();
			arrayPasswords[i]=objeto;
			arrayPasswords[i].contrasena = generarPassword(8);//Generación de la contraseña de cada objeto de nuestro array
			//Se guarda un booleano dependiendo si el Password del array es fuerte o no
			arrayBoolean[i]=arrayPasswords[i].esFuerte(arrayPasswords[i].contrasena);
			//Formato para mostrar la contraseña por pantalla
			System.out.println(arrayPasswords[i].contrasena + " " + arrayBoolean[i]);
		}	
	}
}
