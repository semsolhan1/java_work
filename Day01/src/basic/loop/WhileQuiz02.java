package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		//12의 약수의 총합
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 입력하시오: ");
		int measure = sc.nextInt();
		int i = 1;
		int total = 0;
		System.out.printf("%d의 약수는  ->", measure);
		while(i <= measure) {
			if(measure % i == 0) {
				System.out.printf(" %d ", i);
				total += i;
			}
			i++;
		}
		System.err.printf("-> 총합: %d", total);

		sc.close();
		
	}

}
