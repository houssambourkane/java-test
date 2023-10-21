import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//check where letter e is in str
		//for solution
		String str = "develope";
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'e') {
				System.out.println(index);
			}
		}
		
		//while solution
		int index = 0; //initial condition
		while (index < str.length() /*continuing condition*/) {
			if (str.charAt(index) == 'e') {
				System.out.println(index);
			}
			index++; //update
		}
		
		
		//collatz conjecture
		int n = 1234;
		int steps = 0;
		while( n > 1) {
			if (n%2 == 0) {
				n = n/2;
			} else if (n%2 == 1) {
				n = 3*n+1;
			}
			steps++;
		}
		System.out.println(steps);
		
		//rock paper scissors
		//3 out 5 wins
		Scanner scan = new Scanner(System.in);
		int playerWin = 0;
		int cpuWin = 0;
		while (playerWin < 3 && cpuWin < 3) {
			System.out.println("rps:");
			String playerMove = scan.nextLine(); //r - rock, p - paper, s -scissors
			int cpuMove = (int)(Math.random()*3);
			if ((playerMove.equals("r") && cpuMove == 2)
				||(playerMove.equals("p") && cpuMove == 0)
				||(playerMove.equals("s") && cpuMove == 1)) {
				playerWin++;
			} else if ((cpuMove == 0 && playerMove.equals("s"))
					||(cpuMove == 1 && playerMove.equals("r"))
					||(cpuMove == 2 && playerMove.equals("p"))) {
				cpuWin++;
			} 
			
			System.out.println("player: "+playerMove+", cpu: "+cpuMove);
			System.out.println(playerWin+" vs "+cpuWin);
		}
		if (playerWin >= 3) {
			System.out.println("You win");
		} else {
			System.out.println("You lose");
		}
		
	
	}

}
