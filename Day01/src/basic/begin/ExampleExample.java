package basic.begin;

import java.util.Scanner;

public class ExampleExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("몇 월생 입니까?: ");
		int birthMonth = sc.nextInt();
				
		System.out.println("몇 일생 입니까?: ");
		int birthDay = sc.nextInt();
		
		boolean birth = (birthMonth < 2 && birthDay < 20);
		
		if (birth == true) {
			age += 1;
		}
		
		System.out.printf(
				"이름: %s\n나이: %d\n출생년도: %d", name, age, age = 2022 - age
				);
				
		sc.close();
		
		
		
		
		
		

	}

}
