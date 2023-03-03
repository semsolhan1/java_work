package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		/*
		사용자에게 섭씨 온도를 입력받아서
		화씨온도로 변환하여 출력하는 로직을 작성하세요.
		변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
		화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		# ㄹ 한자 7 -> (℃),     ㄹ 한자 다음장 4 -> (℉)
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("온도를 입력 하세요: ");
		double celsius = sc.nextDouble();// 섭씨 온도 입력을 받는다.
		
		double fahrenheit; // 화씨 변수영역 생성
		
		fahrenheit = celsius * 1.8 + 32; // 섭씨를 화씨로 바꾸는 공식
		
		System.out.printf("\n섭씨: %.1f℃\n화씨: %.1f℉\n",celsius, fahrenheit);// 섭씨온도와 화씨온도를 출력해준다.
				
		sc.close();// 스캐너를 다시 내보낸다.
		
		
		
		

	}

}
