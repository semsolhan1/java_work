package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			toatal +=i;
			i++;
			
		}
		
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += 1;
		}
		*/
		System.out.println("----------------------------------------");
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요 (for)
		for(int i=1; i<=200; i++) { //괄호안 i의 변수는 블록 안에서 사라지게된다.
			if(i % 6 == 0) {
				if(i % 12 != 0) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("-------------------------------");
		
		//1~60000까지의 정수중 177의 배수의 개수를 구해보세요. (for)
		int total = 0;
		
		for(int i=1; i<=60000; i++) {
			if(i % 177 == 0) {
				total++;
			}
		}
		System.out.println(total + " ");
		
		System.out.println("-----------------------------------------------------");
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		//팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int tota = sc.nextInt();
		int n = 1;
		for(int i=tota; i>=1; i--) {
			n *= i;
		}
		System.out.println(n);
		
		sc.close();
		
		

	}

}
