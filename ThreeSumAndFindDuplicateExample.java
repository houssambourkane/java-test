import java.util.Arrays;

public class ThreeSumAndFindDuplicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		for (int i = 0 ; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*10+1);
		}
		System.out.println(Arrays.toString(nums));
		//find if there are three numbers that add up to a number n
		int n = 6;
		for (int i = 0 ; i< nums.length; i++) {
			for (int j = i+1 ; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++)
				if (nums[i] + nums[j] + nums[k] == 6) {
					System.out.println(nums[i]+","+nums[j]+","+nums[k]);
				}
			}
		}
		
		//find duplicate numbers
		for (int i = 0 ; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++ ) {
				if (nums[i] == nums[j]) {
					System.out.println(i+","+j);
				}
			}
		}
		
		
	}

}
