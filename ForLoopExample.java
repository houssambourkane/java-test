
public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Factorial
		int n = 10;
		int result = 1;
		for (int i = n; i >= 1; i--) {
			System.out.print("calculating "+result+" x "+i+":");
			result = result * i;
			System.out.println(result);
		}
		System.out.println(result);
		
		//Check prime number
		int p = 274171; //check 12343217 % 12343216 == 0
						  //check 12343217 % 12343215 == 0
						 // ...
		                 //check 12343217 % 2 == 0
		int counter = 0; //count how many factors p has
		for (int i = 1; i <= p; i++) {
			int remainder = p % i;
			if (remainder == 0) {
				System.out.println("Factor: "+i);
				counter++;
			} 
		}
		if (counter == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		
		//Count how many 'l' is in a test
		String text = "hello world";
		int l_count = 0;
		for (int index = 0; index < text.length(); index++) {
			char c = text.charAt(index);
			System.out.println(c);
			if (c == 'l') {
				l_count++;
			}
		}
		System.out.println(l_count);
		
		//Count how many non-letters are in a text 
		text = "In computer science a for-loop or for loop is a control flow statement for specifying iteration. Specifically, a for loop functions by running a section of code repeatedly until a certain condition has been satisfied.\r\n"
				+ "\r\n"
				+ "For-loops have two parts: a header and a body. The header defines the iteration and the body is the code that is executed once per iteration. The header often declares an explicit loop counter or loop variable. This allows the body to know which iteration is being executed. For-loops are typically used when the number of iterations is known before entering the loop. For-loops can be thought of as shorthands for while-loops which increment and test a loop variable.";
		int non_letter_count = 0;
		for (int index = 0; index < text.length(); index++) {
			char c = text.charAt(index);
			if (((int)c >= 65 && (int)c <= 90) 
					|| ((int)c >= 97 && (int)c <= 122) || c == 32 ) {
				
			} else {
				non_letter_count++;
			}
		}
		System.out.println(non_letter_count);
		
		
	}

}
