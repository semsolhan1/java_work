package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		
		/*
		# 예외 처리
		- 개발자가 코드를 통해 처리할 수 있는 에러를 다루는 것.
		- 예외 처리는 시스템 스스로 오류를 복구하는 것이 아니고
		 오류 발생 가능성이 있는 부분에 대한 처리를 미리 준비하는 것입니다.
		- 시스템의 비정상적 종료를 막고 코드의 흐름이 계속될 수 있도록
		 사전에 준비하는 행위를 말합니다.
		*/
		
		
		
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("점수1: ");
		 try {
		 int i = sc.nextInt();
		 System.out.println("정수2: ");
		 int j = sc.nextInt();
		 
		 System.out.println("나눗셈 시작!");
		 
			 //try블로겡는 예외 발생 가능성이 있는 코드를 작성합니다.
			 System.out.printf("%d / %d = %d\n" , i, j, i/j);
		 } catch(Exception e) {
			 //catch블록에는 try블록에서 실제 예외가 발생했을 경우에
			 //실행할 코드를 작성합니다.
			 System.out.println("0으로 나누지 마세요!");
		 }
		 sc.close();
		 System.out.println("프로그램 정상 종료!");

	}

}
