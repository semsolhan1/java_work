package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		  평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~ 100 -> A+
		 94 ~ 90 -> A0
		 80점대는 B, 70점대는 C, 60점대는 D, 나머지는
		 모두 F 처리하시면 됩니다. (100점이 만점)
		 
		 ex)
		 평균 점수: 95.5
		 당신의 학점은 A+ 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		System.out.printf("평균: %.1f점\n", avg);
		System.out.println("--------------------");
		
		if(avg >= 90) {
			if(avg > 100) {
				System.out.println("잘못된 점수입니다.");
			} else if(avg >= 95) {
				System.out.println("당신의 학점은 A+ 입니다.");
			} else {
				System.out.println("당신의 학점은 A0 입니다.");
			}
		} else if(avg >= 80) {
			System.out.println("당신의 학점은 B 입니다.");
			
		} else if(avg >= 70) {
			System.out.println("당신의 학점은 C 입니다.");
			
		} else if(avg >= 60) {
			System.out.println("당신의 학점은 D 입니다.");
			
		} else {
			if(avg < 0) {
				System.out.println("잘못된 점수입니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}
			
		}
		
		sc.close();
		
		

	}

}







