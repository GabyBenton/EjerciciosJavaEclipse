
import java.util.Scanner;


public class Comisiones {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa el total de tus ventas: ");
		double ventas = in.nextDouble();
		double comision = 0;
		do {
			if(ventas >=10000) {
				comision = ventas *0.30;
				System.out.println("Tu comisión por ventas es del 30%: " +comision);
			}else if((ventas >=5001)||(ventas<=9999)) {
				comision = ventas *0.20;
				System.out.println("Tu comisión por ventas es del 20%: " +comision);
			}else if((ventas>=1001)||(ventas<=4999)) {
				comision = ventas *0.10;
				System.out.println("Tu comisión por ventas es del 10%: " +comision);
			}else {
				System.out.println("No tienes comisión por ventas");
			}//if else
			
		}while(ventas<=0);
		
		in.close();
	}

}
