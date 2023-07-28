import java.util.Scanner;

public class Table {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa un número positivo: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        int i = 1;
	    while (i <=10) {
	    	System.out.println(num*i);
	    	i++;
	    }
       //TODO implement While loop to get print result

	}

}
