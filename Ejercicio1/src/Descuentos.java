import java.util.Scanner;

public class Descuentos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa cuantos boletos quieres: ");
		int boletos = in.nextInt();
		double precioboleto = 7;
		double subtotal =0;
		double total =0;
		System.out.println("Ingresa tu edad: ");
		int edad = in.nextInt();
		
			if((edad >=6)&&(edad<=59)){
				subtotal= precioboleto;
				total = subtotal*boletos;
				//System.out.println(subtotal);
				System.out.println("Compraste "+boletos+ " boletos.\n"
			+ "El total de tu compra es: "+total);
			}else if(edad <=5){
				subtotal = (precioboleto*0.40);
				total = subtotal *boletos;
				//System.out.println(subtotal);
				System.out.println("Compraste "+boletos+ " boletos.\n"
						+ "El total de tu compra es: "+total);
			}else if(edad>=60) {
				subtotal = (precioboleto*0.45);
				total = subtotal *boletos;
				//System.out.println(subtotal);
				System.out.println("Compraste "+boletos+ " boletos.\n"
						+ "El total de tu compra es: "+total);
			}else {
				System.out.println("Compraste "+boletos+ "boletos.\n"
						+ "El total de tu compra es: "+total);
			}//if else
		
		in.close();
	}
}
