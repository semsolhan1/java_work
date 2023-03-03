package basic.ifthe;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
		# 스캐너를 사용하여 정수를 하나 입력받으세요.
		
		- 입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
		- 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다." 를 출력.
		- 입력받은 값이 0이라면 "0입니다." 를 출력.		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력해주세요: ");
		int age = sc.nextInt();
		
		
		if(age == 0) {
			
			System.out.println("0입니다.");
			
			}else if (age % 7 == 0 && age != 0) {
				
			System.out.printf("%d는(은) 7의 배수입니다.", age);
			
			}else {
			System.out.printf("%d는(은) 7의 배수가 아닙니다.", age);
			}
		
		sc.close();
		
	}

}
