package maxesofarray;

/*
2)	Maxes of array: Provide the implementation for the function which takes two array type 
input parameters and return an array which will contain the number based on the following conditions
Array one contains integer numbers like nums = { 2,3, 4, 5}
Array two contains maximum integer numbers like maxs = {2, 4}
Result array should contain all the number such that nums[i]<=maxs[j]
Output : {2,3,4};

 * 
 * */
public class MaxesOfArray {

	public static void main(String[] args) {
		
		int nums[] = {2, 3, 4, 5};
		int maxs[] = {4, 2};
		
		int output[] = null; 
		output = getMaxesOfArray(nums, maxs, output);
		for (int num : output) {
			System.out.print(num + " ");
		}

	}

	private static int[] getMaxesOfArray(int[] nums, int[] maxs, int[] output) {
		
		int max = getMaxOfMaxs(maxs);
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max >= nums[i]) {
				///output[j] = nums[i];
				length ++;
			}
		}
		
		output = new int [length];
		for (int i = 0, j = 0; i < nums.length; i++) {
			if (max >= nums[i]) {
				output[j] = nums[i];
				j ++;
			}
		}
		return output;
	}

	private static int getMaxOfMaxs(int[] maxs) {
		
		int max = 0;
		for (int num : maxs) {
			if (max < num) {
				max = num;
			} 
		}
		return max;
	}

}
