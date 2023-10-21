import java.util.Scanner;

public class QuizSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cc = scan.nextLine();
		if (cc.length() == 16) {
			String first2 = cc.substring(0,2);
			if (first2.equals("51") || first2.equals("52")) {
				System.out.println("Mastercard");
			}
			String first1 = cc.substring(0,1);
			if (first1.equals("4")) {
				System.out.println("Visa");
			}
			
		} else {
			System.out.println("Invalid Card");
		}
		
		
	}
}
