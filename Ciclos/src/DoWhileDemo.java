
public class DoWhileDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		do {
			System.out.println(cont);
			cont++;
		} while (cont <10);
		
		//Ciclo mostrar pares ente 0-100
		System.out.println("------------Ciclo pares-----------------");
		int num=0;
		do {
			System.out.println(num);
			num+=2;
		} while (num <=100);
		
	}
}
