package basic.ifthe;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class IfQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 키와 나이를 입력받아서 사용자가 놀이기구에 탑승 할 수 있는지의 여부를 판단 하시면 됩니다. 키 140cm 이상, 나이가 8세 이상인
		 * 사용자만 놀이기구 탑승이 가능하다고 가정하고, 판단할 수 있는 로직을 작성해 보세요. 하나의 조건이라도 만족하지 못한다면 탑승이
		 * 불가능합니다.
		 * 
		 * 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요!" 를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력해주세요: ");
		double cm = sc.nextDouble();           //키를 입력받습니다.
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();					//나이를 입력받습니다.
		
		System.out.printf("키: %.1fcm이고\n나이: %d살 이므로\n", cm, age);//입력한 정보를 출력한다.
		
		
		if(cm >= 140 && age >= 8) {             //키와 나이가 140cm이상 나이가 8세 이상 일때만 밑의 조건을 실행해라!!
			
	
			System.out.println("탑승을 허용합니다.");
			
		} else {
			System.out.println("탑승을 허용하지 않습니다."); //위의 조건을 둘정 하나라도 성립하지 않으면 이 조건을 실행해라~!!
			
		}
		
		System.out.println("오늘 하루 즐거운 시간 되세요!");
		sc.close();
				
		
		
		
	}
	
	
	
	
	
	
}
