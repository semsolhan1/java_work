package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
		# 사용자에게 구구단 단수를 입력받아서 해당 단수의 구구단을 출력해 보세요.
		ex)

		구구단을 입력하세요: 4
		 *** 구구단 4 단 ***
		4 x 1 = 4
		4 x 2 = 8
		4 x 3 = 12
		4 x 4 = 16
		.
		.
		.
		.
		4 x 9 = 36
		 */
		int i = 1, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("단수를 입력하세요: ");
		int table = sc.nextInt();

		System.out.printf("*** 구구단 %d 단 ***\n", table);
		while(i <= 9) {
			total = table * i;
			System.out.printf("%d x %d = %d\n", table, i, total);
			i++;
		}
		sc.close();





	}

}
