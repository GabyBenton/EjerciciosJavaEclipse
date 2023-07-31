
import java.util.Scanner;

public class Nombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Escribe tu nombre: ");
		Scanner entradita = new Scanner(System.in);
		String name = entradita.nextLine();
		System.out.println("Escribe tu apellido: ");
		String apellido = entradita.nextLine();
		printNameLength(name);
		printNameCharacters(name);
		printApellidoLength(apellido);
		printApellidoCharacters(apellido);	
		System.out.println("tu nombre completo es: "+name+" "+apellido);
	}
	
    public static void printNameLength( String name ){
    	int largo =name.length();
    	System.out.println("El largo de tu nombre es: "+largo);
    }

    public static void printNameCharacters( String name )
    {
    	for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
    }
    
   private static void printApellidoLength( String apellido ){
    	int largo =apellido.length();
    	System.out.println("El largo de tu apellido es: "+largo);
    }

    private static void printApellidoCharacters( String apellido )
    {
    	for (int i = 0; i < apellido.length(); i++) {
			System.out.println(apellido.charAt(i));
		}
    }

}
