package basic.ifthe;

import java.util.Scanner;

public class MyIfQuiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요: ");
		double kor = sc.nextDouble();
		System.out.println("영어 점수를 입력해주세요: ");
		double eng = sc.nextDouble();
		System.out.println("수학 점수를 입력해주세요: ");
		double mat = sc.nextDouble();

		double total;
		String max = "";

		total = (kor + eng + mat) / 3.0;


		if(total < 60){				//59점 이하는 F
			max = "F";
		}

		if(total >= 65) {			//65점 위로 D+
			max = "D+";
		}else if(total >= 60) {		//60점 위로 D0
			max = "D0";
		}
		
		if(total >= 75) {			//75점 위로 C+
			max = "C+";
		}else if(total >= 70) {		//70점 위로 C0		
			max = "C0";
		}
		
		if(total >= 85) {			//85점 위로 B+
			max = "B+";
		}else if(total >= 80) {		//80점 위로 B0
		
			max = "B0";
		}
		
		if(total >= 95) {			//95점 위로 A+
			max = "A+";
		}else if(total >= 90) {		//90점 위로 A0
		
			max = "A0";
		}

		if(total > 100) {			//100점 이상일 때
			System.out.println("점수를 다시 확인해 주세요"); //점수를 다시확인해달라는 문자 출력

		}else if(total == 100) {	//100점 같을 때
			System.out.println("평균점수는 만점입니다.");	//점수는 만점을 출력
		}else { 										//99점 이하는 학점 표시, 평균점수 표시
			System.out.printf("평균점수: %.1f\n", total);	
			System.out.printf("당신의 학점은 %s 입니다.\n", max);
		}



		sc.close();

	}

}
