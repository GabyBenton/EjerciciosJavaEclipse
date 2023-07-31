/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class CalculatorBrain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradita = new Scanner(System.in);
		System.out.println("------------------Calculadora-------------------");
		System.out.println("Se hará la suma, resta, multiplicación y \n "
				+ "división de los números que ingreses.");
		System.out.println("Ingresa número 1: ");
		Double a = entradita.nextDouble();
		System.out.println("Ingresa número 2: ");
		Double b = entradita.nextDouble();
		suma(a,b);
		multiplicacion(a,b);
		resta(a,b);
		division(a,b);
		
	}
	
	public static void suma(double a, double b) {
		 double sum=(a+b);
		 System.out.println("Esta es la suma: "+sum);
	}
	public static void multiplicacion(double a, double b) {
		double mul=(a*b);
		 System.out.println("Esta es la multiplicacion: "+mul);
	}
	public static void resta(double a, double b) {
		double res=(a-b);
		 System.out.println("Esta es la resta: "+res);
	}
	public static void division(double a, double b) {
		double div=(a/b);
		 System.out.println("Esta es la division: "+div);
	}

}
