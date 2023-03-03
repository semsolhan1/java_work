package basic.ifthe;

import java.util.Scanner;

public class IfQuiz02 {

	
	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰지 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수: 4, 7 -> 7이 큰수입니다.
		 입력받은 수: 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수: 5, 5 -> 같은 수 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력 해주세요: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		if(first > second) {
			System.out.printf("%d가 큽니다.", first);
		} else if (first < second) {
			System.out.printf("%d가 큽니다.", second);
		} else {
			System.out.println("두 수는 같은 수 입니다.");
			
		}
		
		sc.close();
		
	}
}
