package chap1;

import java.util.Scanner;

public class Solution01 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] nums = new int[9];
			
			for(int i=0; i<10; i++) {
				System.out.println("숫자 입력: ");
				int numb = sc.nextInt();
				
				nums[i] = numb;
				
			}
			int max = 0;
			for(int i=0; i<10; i++) {
				if(max < nums[i]) {		//넘스값이 클때 맥스값에 넣어준다.
					max = nums[i];		//맥스에 값을 덮어 씌운다.
				}
			}
			System.out.println("가장 큰 값: " + max);
			
	}

}
