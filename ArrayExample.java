
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[10];
		//initialize nums with random numbers
		for (int index = 0 ; index < nums.length; index++) {
			nums[index] = (int)(Math.random()*10);
		}
		
		for (int i = 0 ; i < nums.length; i++) {
			if (i < nums.length-1) {
				System.out.print(nums[i]+",");
			} else {
				System.out.print(nums[i]);
			}
		}
		System.out.println();
		
		//how to search within a array
		//print the first index where query is found
		//-1 if not found
		int query = 5;
		boolean found = false;
		for (int i = 0 ; i < nums.length; i++) {
			if (nums[i] == query) {
				System.out.println(query+" is found at " + i);
				found = true;
				break;
			}
		}
		if (!found) System.out.println(-1);
		
		
		
		
		
		//create a string array
		String[] texts = new String[5];
		texts[0] = "hello";
		texts[1] = "world";
		texts[2] = "goodbye";
		//print out each string element's length, 
		//check for null string
		for (int i = 0; i <texts.length; i++) {
			if (texts[i] != null) {
				System.out.println(texts[i].length());
			} else if (texts[i] == null) {
				System.out.println("null, no length");
			}
		}
		
		//find the index of the query string
		//if not found, print -1
		String q = "world";
		found = false;
		for (int i = 0 ; i < texts.length; i++) {
			if (texts[i] != null && texts[i].equals(q)) {
				System.out.println("\""+q+"\" is found at "+i);
				found = true;
			} 
		}
		if (!found) System.out.println(-1);
		
		
		
		
		
	}

}
