package basic.array;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		/*
		 # 2차원 배열
		 - 배열 안에 배열이 존재하는 형태를 2차원 배열이라고 합니다.
		 - 실제 배열에는 배열의 주소값이 들어가게 됩니다.
		 */
		
//		int[] arr = {1, 2, 3};
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12, 13, 14}
		};
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println(arr[2][2]);
		System.out.println(arr[1][0]);
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("-------------------------------");
		
		//빈 2차원 배열 만들기
		int[][] arr2 = new int[3][4];
		System.out.println(Arrays.deepToString(arr2));
		
		arr2[1][2] = 50;
		arr2[2][1] = 70;
		
		for(int[] array : arr2) {
			for(int n : array) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		

	}

}


















