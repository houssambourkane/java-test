import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your meal price?");
		String mealPrice = input.nextLine();
		System.out.println("How much do you want to tip?");
		String tip = input.nextLine();
		double mp = Double.parseDouble(mealPrice);
		double t = Double.parseDouble(tip);
		double total = mp*t;
		System.out.println("Your tip is $"+total);
	}
}

