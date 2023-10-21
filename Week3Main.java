import java.util.Scanner;

public class Week3Main {
	public static void main(String[] args) {
		
		System.out.println("What's your name (First Last):");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		//check for space
		//check for upper case first letter
		//indexOf(), 
		int whereTheSpaceIs = name.indexOf(' ');
		if (whereTheSpaceIs == -1) {
			System.out.println("name is invalid");
		} else {
			String firstName = name.substring(0, whereTheSpaceIs);
			String lastName = 
					name.substring(whereTheSpaceIs+1, name.length());
			char FNFL = firstName.charAt(0);
			char LNFL = lastName.charAt(0);
			
			if (       (  (int)FNFL >= 65 && (int)FNFL <= 90  ) 
					&& (  (int)LNFL >= 65 && (int)LNFL <= 90  )  
				) {
				System.out.println("name is valid");
			} else {
				System.out.println("name is invalid");
			}
			
		}
		
		
		
		//Problem 1
		System.out.println("Rock Paper Scissors:");
		String userMove = scan.nextLine();
		int cpuMove = (int)(Math.random()*3);
		
		String uMove = "";
		if (userMove.equals("0")) {
			uMove = "Rock";
		} else if (userMove.equals("1")) {
			uMove = "Paper";
		} else if(userMove.equals("2")) {
			uMove = "Scissors";
		}
		
		String cMove = "";
		if (cpuMove == 0) {
			cMove = "Rock";
		} else if (cpuMove == 1) {
			cMove = "Paper";
		} else if (cpuMove == 2) {
			cMove = "Scissors";
		}
		
		System.out.println(uMove + " vs " + cMove);
		
		if (uMove.equals("Rock") && cMove.equals("Scissors")
			||uMove.equals("Paper") && cMove.equals("Rock")
			||uMove.equals("Scissors") && cMove.equals("Paper")
			) {
			System.out.println("You win");
		} else if (uMove.equals("Rock") && cMove.equals("Paper")
				||uMove.equals("Paper") && cMove.equals("Scissor")
				||uMove.equals("Scissors") && cMove.equals("Rock")
				) {
			System.out.println("CPU wins");
		} else {
			System.out.println("Draw");
		}
		
	}
}
