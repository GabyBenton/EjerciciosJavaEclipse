import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3=0;
		int cont=0;
		Scanner in = new Scanner(System.in);
		System.out.println("--------Serie Fibonacci -----------");
		System.out.println("Ingresa un número: ");
		int n = in.nextInt();
		//0 1 1 2 3 5 
		
		do {
			System.out.println(num3);
			num1=num2;
			num2=num3;
			num3 = num1 +num2;
			cont++;
		} while (cont<n);	
	}
}
