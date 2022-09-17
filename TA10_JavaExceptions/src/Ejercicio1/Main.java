package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//El número generado estará entre 1 y 500, porque primero lo multiplicamos por 500 con lo que tendríamos un número entre 0 y 499 y al sumarle 1 a este número tendremos finalmente un número entre 1 y 500
		int numeroAleatorio = (int)(Math.random()*500+1), entradaTeclado=0, veces=0;

		System.out.println ("Introduce un valor por teclado:");
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
		while (entradaTeclado!=numeroAleatorio) {
    
			try {
				//Si el usuario introduce algo que no es un número
				entradaTeclado = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
			} catch (InputMismatchException e) {
				System.out.println ("No se ha conseguido reconocer la entrada");
			}
        
			if (entradaTeclado>numeroAleatorio) {//Si la entrada es mayor al numero aleatorio
				veces++;
				System.out.println ("El numero introducido debe ser menor \n");
			} else {//Si la entrada es menor al numero aleatorio
				veces++;
				System.out.println ("El numero introducido debe ser mayor \n");
			}
			System.out.println ("Introduce otro valor:");
		}
		entradaEscaner.close();
		
		System.out.println ("Corecto! Has adivinado el numero!");
		System.out.println ("Su numero de intentos ha sido: " + veces);

	}

}