import java.util.*;

public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------Nombre-------- ");
		Scanner entradita = new Scanner(System.in);
		System.out.println("Ingresa un nombre: ");
		String nombre = entradita.next();
		System.out.println("Los caracteres son: ");
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		
		
		System.out.println("--------For extra------- ");
		for (int i = 15; i <=30; i+=3) {
			System.out.println(i);
		}
	}

}
