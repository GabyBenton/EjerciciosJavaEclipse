import java.util.*;

public class IfElseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Dime la calificación");
		int testScore = in.nextInt();
		char grade;
		if(testScore >=90) {
			grade = 'A';
		}else if(testScore >= 80) {
			grade = 'B';
		}else if(testScore >=70) {
			grade = 'C';
		}else if(testScore >=60) {
			grade = 'D';
		}else {
			grade= 'F';
		}//if else
		System.out.println("Grade = " + grade);
		in.close();
	}

}
