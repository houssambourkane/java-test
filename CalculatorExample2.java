import java.util.Scanner;

public class CalculatorExample2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculator app
		//user input 2+3 one the same line
		//then calculate the answer
		//support +, -, *, /, %
		//will not support negative number
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine(); //23+45
		//figure out what operation we are doing
		//extract operand 1
		//extract operand 2
		int wherePlusIs = input.indexOf('+');
		if ( wherePlusIs != -1 ) {
			String num1 = input.substring(0, wherePlusIs);
			int op1 = Integer.parseInt(num1);
			String num2 = input.substring(wherePlusIs+1, input.length());
			int op2 = Integer.parseInt(num2);
			System.out.println(op1+op2);
		}
		
		int whereMinusIs = input.indexOf('-');
		if ( whereMinusIs != -1 ) {
			String num1 = input.substring(0, whereMinusIs);
			int op1 = Integer.parseInt(num1);
			String num2 = input.substring(whereMinusIs+1, input.length());
			int op2 = Integer.parseInt(num2);
			System.out.println(op1-op2);
		}
		
		int whereMiltiIs = input.indexOf('*');
		if ( whereMiltiIs != -1 ) {
			String num1 = input.substring(0, whereMiltiIs);
			int op1 = Integer.parseInt(num1);
			String num2 = input.substring(whereMiltiIs+1, input.length());
			int op2 = Integer.parseInt(num2);
			System.out.println(op1*op2);
		}
		
		int whereDivIs = input.indexOf('/');
		if ( whereDivIs != -1 ) {
			String num1 = input.substring(0, whereDivIs);
			int op1 = Integer.parseInt(num1);
			String num2 = input.substring(whereDivIs+1, input.length());
			int op2 = Integer.parseInt(num2);
			if (op2 == 0) {
				System.out.println("Can't do that");
			} else {
				System.out.println(op1/op2);
			}
		}
		
		int whereModIs = input.indexOf('%');
		if ( whereModIs != -1 ) {
			String num1 = input.substring(0, whereModIs);
			int op1 = Integer.parseInt(num1);
			String num2 = input.substring(whereModIs+1, input.length());
			int op2 = Integer.parseInt(num2);
			if (op2 == 0) {
				System.out.println("Can't do that");
			} else {
				System.out.println(op1%op2);
			}
		}
		
		
	}
}
