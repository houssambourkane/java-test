import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double[][] flowers = new double[150][4];
			Scanner scan = new Scanner(new File("iris.csv"));
			int nextAvailableRow = 0;
			while (scan.hasNextLine()) {
				String row = scan.nextLine();
				String[] tokens = row.split(",");
				if (tokens.length < 5 ) break;
				for (int i = 0 ; i < 4; i++) {
					double temp = Double.parseDouble(tokens[i]);
					flowers[nextAvailableRow][i] = temp;
				}
				nextAvailableRow++;
			}
			
			//get  column at index 0 into separate array
			double[] column0 = new double[150];
			for (int i = 0 ; i < flowers.length; i++) {
				column0[i] = flowers[i][0];
			}
			System.out.println(Arrays.toString(column0));
			
			//get highest number
			double highest = flowers[0][0];
			for (int r = 0; r < flowers.length; r++) {
				for(int c = 0; c < flowers[0].length ; c++) {
					if (highest < flowers[r][c]) highest = flowers[r][c];
				}
			}
			System.out.println(highest);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("file not found");
		}

	}

}
