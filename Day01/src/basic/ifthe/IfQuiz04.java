package basic.ifthe;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		/*
		- 정수 3개를 입력 받습니다.
		- 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

		# max, mid, min이라는 변수를 미리 선언하셔서 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		 마지막에 한 번에 출력하시면 되겠습니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int esc1 = sc.nextInt();
		System.out.println("정수2: ");
		int esc2 = sc.nextInt();
		System.out.println("정수3: ");
		int esc3 = sc.nextInt();

		/*if(esc1 > esc2 && esc1 > esc3) {
			if (esc2 > esc3){
				System.out.printf("정수1: %d는 max, 정수2: %d는 mid, 정수3: %d는 min입니다.\n", esc1, esc2, esc3);

			}else if(esc2 < esc3) {
				System.out.printf("정수1: %d는 max, 정수2: %d는 min, 정수3: %d는 mid입니다.\n", esc1, esc2, esc3);
			}
		}else if(esc2 > esc1 && esc2 > esc3) {
			if(esc1 > esc3) {
				System.out.printf("정수1: %d는 mid, 정수2: %d는 max, 정수3: %d는 min입니다.\n", esc1, esc2, esc3);

			}else if(esc1 < esc3) {
				System.out.printf("정수1: %d는 min, 정수2: %d는 max, 정수3: %d는 mid입니다.\n", esc1, esc2, esc3);

			}
		}else if(esc3 > esc2 && esc3 > esc1) {
			if(esc2 > esc1) {
				System.out.printf("정수1: %d는 min, 정수2: %d는 mid, 정수3: %d는 max", esc1, esc2, esc3);

			}else if(esc2 < esc1) {
				System.out.printf("정수1: %d는 min, 정수2: %d는 mid, 정수3: %d는 max", esc1, esc2, esc3);
			}
		}*/
		
		int max, mid, min;
		if(esc1 > esc2 && esc1 > esc3) {
			max = esc1;
					if(esc2 > esc3) {
						mid = esc2; min = esc3;
					}else {
						mid = esc3; min = esc2;
					}
		}else if(esc2 > esc1 && esc2 > esc3) {
			max = esc2;
			if(esc1 > esc3) {
				mid = esc1; min = esc3;
			}else {
				mid = esc3; min = esc1;
			}
		}else {
			max = esc3;
			if(esc2 > esc1) {
				mid = esc2; min = esc1;
			}else {
				mid = esc1; min = esc2;
			}
		}
		
		System.out.printf("최대값: %d\n중간값: %d\n최소값: %d", max, mid, min);
		
		sc.close();

	}




}
