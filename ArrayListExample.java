import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Character> chars = new ArrayList<Character>(); // char[] text = new char[10];
		ArrayList<String> book = new ArrayList<String>();
		ArrayList<double[]> iris_row = new ArrayList<double[]>();
		
		for (int i = 0 ; i < 2000; i++) {
			nums.add((int)(Math.random()*10000)); //appending to array list
		}
		
		nums.set(100, 8888);  //nums[1000] = 8888
		nums.remove(100);
		
		//find 8888;
		for (int i = 0 ; i < nums.size(); i++) {
			if (nums.get(i) == 8888) { //nums[i] == 8888
				System.out.println(i);
			}
		}
		
		//sort the arraylist
		for (int i = 0 ; i < nums.size(); i++) {
			for (int j = 0 ; j < nums.size(); j++) {
				if (nums.get(i) < nums.get(j)) {
					int temp = nums.get(j);
					nums.set(j, nums.get(i)); //nums[j] = nums[i];
					nums.set(i, temp);        //nums[i] = temp;
				}
			}
		}
		System.out.println(nums.toString());
		
		
		//remove all instances of an element from array list text
		ArrayList<String> text = new ArrayList<String>();
		text.add(",");
		text.add("hello");
		text.add(",");
		text.add(",");
		text.add(",");
		text.add("this");
		text.add("is");
		text.add("124");
		text.add(",");
		text.add("welcome");
		System.out.println(text.toString());
		for (int i = 0 ; i < text.size(); i++) {
			String token = text.get(i);
			if (token.equals(",")) {
				text.remove(i);
				i--; //critical because remove moves all elements forward one
			}
		}
		
		System.out.println(text.toString());
		
	}

}
