import java.util.*;

public class EjerciciosPrueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Ejercicio 1------------");
		for (int i = 1; i <=3; i++) {
			for (int y = 1; y <=3; y++) {
				System.out.println(i+""+y);
			}
		}
		
		
		System.out.println("-----------Ejercicio 2------------");
		Scanner entradita = new Scanner(System.in);
		System.out.println("Ingresa el número de filas: ");
		int filas = entradita.nextInt();
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-----------Ejercicio 3------------");
		Scanner entradita1 = new Scanner(System.in);
		System.out.println("Ingresa el número de filas: ");
		int filas1 = entradita1.nextInt();
		for (int i = filas1; i >= 1; i--) {
			for (int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for (int i = filas1; i >=1; i--) {
			for (int j = 1; j <=filas1-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
