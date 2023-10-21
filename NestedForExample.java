import java.util.Scanner;

public class NestedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		//duplicate letters
		//hello has consecutive letter (also is duplicate)
		//level has duplicate letter
		for (int i = 0 ; i < str.length(); i++) {
			char letter = str.charAt(i);
			for (int j = i+1; j < str.length(); j++) {
				char letter2 = str.charAt(j);
				if (letter == letter2) {
					System.out.println("duplicate "
						+ ""+letter+" at "+i+" and "+j);
				}
			}
		}
		
		String str2 = scan.nextLine();
		//check if str has same letter as str1
		for (int i = 0 ; i < str.length(); i++) {
			for (int j = 0 ; j < str2.length(); j++) {
				if (str.charAt(i) == str2.charAt(j)) {
					System.out.println("same "
							+ ""+str.charAt(i)+" at "+i+" and "+j);
				}
			}
		}
		
		//print a square with n '*'s
		int n = 7;
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//print a checkered board with n '*'s
		
		
	}

}
