import java.util.*;

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Selecciona un mes (1-12): ");
		int month = in.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28/29");
			break;
		default:
			System.out.println("No es un mes válido");
			break;
		}//switch
		in.close();
	}//main
}
