package basic.ifthe;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		// 점수를 받아 합격 불합격을 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내점수는" + point + "점");
		System.out.println("----------------------------------");
		
		if(point >= 70) {    //조건식의 결과가 참일 경우에만 실행이된다.
			System.out.println("70점 이상입니다."); // 조건식의 결과가 참이 맞을경우 실행하는 문장
			System.out.println("congratulation"); // 참이 아니며 실행하지않고 if를 거치지 않는다.
		} else {
			System.out.println("70점 미달입니다.");//참이 아니면 위 블록을 건너뛰고 실행한다.
			System.out.println("TT");
		}

		System.out.println("시험치르느라 수고하셨습니다.");
		/*
		 * if(point < 70) { System.out.println("70점 미달입니다.");//참이 아니면 위 블록을 건너뛰고 실행한다.
		 * System.out.println("TT"); }
		 */
	
				sc.close();

	}

}
