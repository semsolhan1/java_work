package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("이름을 입력해 주세요: ");
	String name = sc.next();
	
	System.out.print("나이를 입력해 주세요: ");
	int age = sc.nextInt();
	
	
	System.out.printf("이름: %s\n나이: %d세\n", name, age);
	age -= 2023;
	age *= (-1);
	System.out.printf("출생년도: %d", age);
//	복합연산자를 사용하여 나타냄

//	System.out.printf("이름: %s\n나이: %d세\n출생년도: %d년", name, age, 2024 - age);
//	printf로 한번에 나타냄
	
//	System.out.println("이름: %d\n", name);
//	System.out.printf("나이: %d세\n", age);
//	System.out.print("출생년도: " + (2024 - age) + "년");
//	따로따로 나타냄	
	sc.close();
	
		
		

	}

}
