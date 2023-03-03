package basic.ifthe;

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
		 평균점수: 95.5
		 당신의 학점은 A+ 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요: ");
		double kor = sc.nextDouble();
		System.out.println("영어 점수를 입력해주세요: ");
		double eng = sc.nextDouble();
		System.out.println("수학 점수를 입력해주세요: ");
		double mat = sc.nextDouble();

		double total;
		String max = "";

		total = (kor + eng + mat)/3;
		if(total > 100) {
			System.out.println("점수를 다시 확인해 주세요");
		}else {
			if(total == 100) {

				max = "만점";
			}else if(total >= 90) {
				if(total >= 95) {
					max = "A+";
				}else {
					max = "A0";
				}
			}else if(total >= 80) {
				if(total >= 85) {
					max = "B+";
				}else {
					max = "B0";
				}

			}else if(total >= 70) {
				if(total >= 75) {
					max = "C+";
				}else {
					max = "C0";
				}

			}else if(total >= 60) {
				if(total >= 65) {
					max = "D+";
				}else {
					max = "D0";
				}

			}else if(total < 60){
				max = "F";
			}
			System.out.printf("평균점수: %.2f\n", total);	
			System.out.printf("당신의 학점은 %s 입니다.\n", max);
		}


		sc.close();



	}

}
