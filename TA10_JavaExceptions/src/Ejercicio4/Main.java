package Ejercicio4;

import java.util.*;

public class Main {
	
	private static void suma(Scanner teclado) {
		double x=0.0;
		double y=0.0;
		double suma=0;

		System.out.println("Introduzca primer numero: ");
		x = teclado.nextInt();

		System.out.println("Introduzca segundo numero: ");
		y = teclado.nextInt();
		
		try {
			suma=x+y;
		} catch(ArithmeticException e){ //Excepción utilizada cuando el atributo se desborda
			System.out.println(e.getMessage());
		} catch (NullPointerException e) { //Excepción para números 'null'
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) { //Excepción que intenta convertir una cadena (con formato inadecuado) a uno de los tipos numéricos
			System.out.println(e.getMessage()); 
		} finally {
			System.out.println("La solucion de la suma es: " + suma + "\n");
		}
		
	}
	
	private static void resta(Scanner teclado) {
		double x=0.0;
		double y=0.0;
		double resta=0;

		System.out.println("Introduzca primer numero: ");
		x = teclado.nextInt();

		System.out.println("Introduzca segundo numero: ");
		y = teclado.nextInt();
		
		try {
			resta=x-y;
		} catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("La solucion de la resta es: " + resta + "\n");
		}
		
	}
	
	private static void multiplicacion(Scanner teclado) {
		double x=0.0;
		double y=0.0;
		double multiplicacion=0;

		System.out.println("Introduzca primer numero: ");
		x = teclado.nextInt();

		System.out.println("Introduzca segundo numero: ");
		y = teclado.nextInt();
		
		try {
			multiplicacion=x*y;
		} catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("La solucion de la multiplicacion es: " + multiplicacion + "\n");
		}
		
	}
	
	private static void potencia(Scanner teclado) {
		double x=0.0;
		double potencia=0;

		System.out.println("Introduzca el numero: ");
		x = teclado.nextInt();
		
		try {
			potencia=x*x;
		} catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("La solucion de la potencia es: " + potencia + "\n");
		}
		
	}
	
	private static void raizcuadrada(Scanner teclado) {
		double x=0.0;
		double raizcuadrada=0;

		System.out.println("Introduzca primer numero: ");
		x = teclado.nextInt();
		
		try {
			raizcuadrada=Math.sqrt(x);
		} catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("La solucion de la raiz cuadrada es: " + raizcuadrada + "\n");
		}
		
	}
	
	private static void raizcubica(Scanner teclado) {
		double x=0.0;
		double raizcubica=0;

		System.out.println("Introduzca primer numero: ");
		x = teclado.nextInt();
		
		try {
			raizcubica=Math.pow(x, (double) 1 / 3);
		} catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("La solucion de la raiz cubica es: " + raizcubica + "\n");
		}
		
	}
	
	private static void division(Scanner teclado) {
		double numerador=0.0;
		double denominador=0.0;
		double division=0;

		System.out.println("Introduzca el numerador: ");
		numerador = teclado.nextInt();

		System.out.println("Introduzca el denominador: ");
		denominador = teclado.nextInt();
		
		try {
			division=numerador/denominador;
		} catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("La solucion de la division es: " + division + "\n");
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Opcion suma");
            System.out.println("2. Opcion resta");
            System.out.println("3. Opcion multiplicacion");
            System.out.println("4. Opcion potencia");
            System.out.println("5. Opcion raiz cuadrada");
            System.out.println("6. Opcion raiz cubica");
            System.out.println("7. Opcion division");
            System.out.println("8. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la suma");
                        suma(sn);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la resta");
                        resta(sn);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la multiplicacion");
                        multiplicacion(sn);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la potencia");
                        potencia(sn);
                        break;
                    case 5:
                        System.out.println("Has seleccionado la raiz cuadrada");
                        raizcuadrada(sn);
                        break;
                    case 6:
                        System.out.println("Has seleccionado la raiz cubica");
                        raizcubica(sn);
                        break;
                    case 7:
                        System.out.println("Has seleccionado la division");
                        division(sn);
                        break;
                    case 8:
                    	System.out.println("Fin del programa");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
	}
}

