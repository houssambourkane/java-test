import java.util.Scanner;

public class Week4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		//find a letter in str1
		char query = 'a';
		boolean found = false;
		for (int index = 0; index < str1.length(); index++) {
			char letter = str1.charAt(index);
			if (letter == query) {
				found = true;
				System.out.println(query+" found at index "+index);
			}
		}
		if (!found) {
			System.out.println(query+" is not found.");
		}
		
		//implement String’s indexOf using for loop (Extra Credit)
		//if not found, print -1
		query = 'b';
		found = false;
		for (int index = 0; index < str1.length(); index++) {
			char letter = str1.charAt(index);
			if (letter == query && !found) {
				found = true;
				System.out.println("Our indexof "+index);
			}
		}
		if (!found) {
			System.out.println(-1);
		}
		
		//implement String substring(start, end)
		int start = 1;
		int end = 4;
		String substr = "";
		for (int index = start; index < end; index++) {
			char letter = str1.charAt(index);
			substr = substr+letter;
		}
		System.out.println("Our substring: "+substr);
		System.out.println(str1.substring(start, end));
		
		//implement String equals(str2)
		//helloo, helleo
		boolean stillTheSame = true;
		if (str1.length() != str2.length()) {
			System.out.println(false);
		} else {
			for (int index = 0; index < str1.length(); index++) {
				char letter1 = str1.charAt(index);
				char letter2 = str2.charAt(index);
				if (letter1 != letter2) {
					stillTheSame = false;
				}
			}
			System.out.println(stillTheSame);
		}
		
		//find where the first difference is 
		for (int index = 0; index < str1.length(); index++) {
			char letter1 = str1.charAt(index);
			char letter2 = str2.charAt(index);
			if (letter1 != letter2) {
				System.out.println("different at "+index);
				break;
			}
		}
		
	}

}

/*Follow the in-class implementation of indexOf, 
implement your version of lastIndexOf using for
loop. lastIndexOf prints out the last index of the queried 
character in str1. If the queried
character cannot be found in str1, print -1.
For example: If str1 is “hello world”, 
then lastIndexOf ‘o’ is 7, and lastIndexOf ‘a’ is -1*/
