package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		1. 2가지의 정수를 1~100 사이의 난수를 발생시켜서 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		사용자가 0을 입력하면 반복문을 탈출시키세요.


		2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.

*/		
		//아직 미완성됬다.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int num1 = (int)((Math.random())*100)+1;
		int num2 = (int)((Math.random())*100)+1;
		int nums = (int)(Math.random())*2;
		if(nums == 0) {
			System.out.printf("%d + %d = ???", num1, num2);
			num1 += num2;
			
		}
		if(nums == 1) {
			System.out.printf("%d - % = ???", num1, num2);
			num1 -= num2;
		}
		int input = sc.nextInt();
		
		if(input == num1) {
			System.out.println("정답입니다.");
			break;
		}else if(input == 0) {
			System.out.println("정답은" + num1 + "이야~~");
			
		}else {
			System.out.println("틀린답입니다.");
		}
		
		
		}
		 
		 
sc.close();







		}

		

	}


