import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {

		//calculator
		//user input operand 1 on line 1
		//user input operation +, - * , / on line 2 
		//user input operand 2 on line 3
		//2
		//+
		//3
		//inputs
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to calculate");
		String op1Str = scan.nextLine();
		int op1 = Integer.parseInt(op1Str);
		String op = scan.nextLine();
		String op2Str = scan.nextLine();
		int op2 = Integer.parseInt(op2Str);
		//output
		int result = 0;
		//logic
		if (op.equals("+")) {
			result = op1+op2;
		} else if (op.equals("-")) {
			result = op1-op2;
		} else if (op.equals("*")) {
			result = op1*op2;
		} else if (op.equals("/")){
			if (op2 == 0) {
				System.out.println("Can't do that");
			}
			else {
				result = op1/op2;
			}
		} 
		
		System.out.println(result);
		
		
		
		
	}
}

