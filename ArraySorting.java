import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[100];
		for (int i = 0 ; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*1000);
			
		}
		System.out.println(Arrays.toString(nums));
		
		
		//selection sort
		for (int i = 0 ; i < nums.length; i++) {
			int smallest_index = i;
			for (int j = i; j < nums.length; j++) {
				if (nums[j] < nums[smallest_index]) {
					smallest_index = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[smallest_index];
			nums[smallest_index] = temp;
		}
		System.out.println(Arrays.toString(nums));
		
		//bubble sort
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0 ; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
		
		
		
	}

}
