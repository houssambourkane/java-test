import java.util.Arrays;

public class StringArraySortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sorting String using compareTo();
		String text = "Indonesia's capital city, Jakarta, is on Java's northwestern coast. Many of the best known events in Indonesian history took place on Java. It was the centre of powerful Hindu-Buddhist empires, the Islamic sultanates, and the core of the colonial Dutch East Indies. Java was also the center of the Indonesian struggle for independence during the 1930s and 1940s. Java dominates Indonesia politically, economically and culturally. Four of Indonesia's eight UNESCO world heritage sites are located in Java: Ujung Kulon National Park, Borobudur Temple, Prambanan Temple, and Sangiran Early Man Site";
		text = text.toLowerCase();
		
		String[] token = text.split(" ");
		
		//bubble sort
		for (int i = 0 ; i < token.length; i++) {
			for (int j = 0 ; j < token.length; j++) {
				if (token[i].compareTo(token[j]) < 0) {
					String temp = token[i];
					token[i] = token[j];
					token[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(token));
		
		
		//sorting rows in two dimensional String array
		String[][] grades = new String[5][2];
		grades[0][0] = "Mehdi";
		grades[0][1] = "85";
		grades[1][0] = "Maxim";
		grades[1][1] = "50";
		grades[2][0] = "Beckie";
		grades[2][1] = "72";
		grades[3][0] = "Jake";
		grades[3][1] = "99";
		grades[4][0] = "Kayla";
		grades[4][1] = "92";
		
		//sort based on name
		for (int i = 0 ; i < grades.length; i++) {
			for (int j = 0 ; j < grades.length;j++) {
				if (grades[i][0].compareTo(grades[j][0]) < 0) {
					String[] temp = grades[i];
					grades[i] = grades[j];
					grades[j] = temp;
				}
			}
		}
		
		for (int i = 0 ; i < grades.length; i++) {
			for(int j = 0 ; j < grades[0].length; j++) {
				System.out.print(grades[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
