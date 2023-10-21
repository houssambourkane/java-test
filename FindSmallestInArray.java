
public class FindSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[100];
		for (int i = 0 ; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*1000);
			System.out.println(nums[i]);
		}
		
		//how to find the largest value in nums
		int largest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		System.out.println("largest is: "+largest);
		
		//how to find the smallest value
		int smallest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		System.out.println("smallest is: "+smallest);
		
		//how to find where (the index) the largest value in nums is
		int largest_index = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] > nums[largest_index]) {
				largest_index = index;
			}
		}
		System.out.println("largest index is: "+largest_index);
		
	
		
	}

}
