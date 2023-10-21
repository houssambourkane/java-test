import java.util.Scanner;

public class FooBarExample {
	public static void main(String[] args) {

		int num = 4;
		//divisible by 2, print foo
		//divisible by 3, print bar
		//divisible by 6, print foobar
		if (num%6 == 0) {
			System.out.println("foobar");
		} else if (num%3 == 0) {
			System.out.println("bar");
		} else if (num%2 == 0) {
			System.out.println("foo");
		}
		
		
		
		
	}
}

