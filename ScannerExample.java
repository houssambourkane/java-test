import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How much do you want to invest?");
		String inv = scan.nextLine();
		double invest = Double.parseDouble(inv);
		//this is what I have at end of year 1
		double allMoney = invest + invest*0.08;
		//this is what I have at end of year 2
		allMoney = allMoney + allMoney*0.04;
		System.out.println("I will have $"+allMoney);
		
		System.out.println("What is your birthday: mm/dd/yyyy");
		String bday = scan.nextLine();
		//age: year now - birth year
		String byear = bday.substring(6, 10);
		int by = Integer.parseInt(byear);
		int age = 2023 - by;
		System.out.println("Your age might be "+age);
		
		System.out.println("What is your last name?");
		String name = scan.nextLine();
		System.out.println("What is your student ID?");
		String sid = scan.nextLine();
		//your email is going to be last name + first 2 digit of your id"
		System.out.println("Your school email will be:");
		System.out.println(name+sid.substring(0,2)+"@hws.edu");
	
	}

}
