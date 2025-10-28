package interview.code;

public class MissingElement {

	public static void main(String[] args) {
		int[] nums= {3,1,4,6,7,5};
		int result = findMissingNumber(nums);
		System.out.println(result);
	}

	private static int findMissingNumber(int[] nums) {
		int n = nums.length +1;  // since one number is missing
		int expSum = n*(n+1)/2;  //6*(6+1)/2 = 21
		int actSum = 0;
		for(int num : nums) {
			actSum = actSum + num;
			
		}
		return expSum - actSum;
	}
	

}
