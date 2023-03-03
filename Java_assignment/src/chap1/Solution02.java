package chap1;

public class Solution02 {

	public static void main(String[] args) {
		int[] nums = {4, 2, 6, 1, 3};

		for(int i=0; i<nums.length; i++) {
			System.out.println();
			for(int j=0; j<nums[i]; j++) {
				System.out.print("★");

			}
		}
	}

}
