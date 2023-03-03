package basic.loop;

import java.util.Scanner;

//import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
		
		/*
		 # 무한 루프

         - 무한 루프는 반복 횟수를 정하지 않고 무한하게 반복문을
          실행하는 구조입니다.

         - 처음 반복문을 구성할 때, 개발자가 사전에 정확한 반복 횟수를
          파악할 수 없다면, 무한루프를 일단 구성해 두고
          특정 조건을 통해 종료할 수 있도록 코드를 설계합니다.

         - 일반적으로 정확한 반복 횟수를 알고 있다면 for문을 사용하고,
          정확한 반복 횟수를 모른다면 while을 통한 무한 루프를 형성하여
          사용합니다. while(true), for(;;)
		*/
		
		int i = 1;
		while(true) {
			if(i > 5) {
				break;
			}
			
			System.out.println("안녕하세요" + i);
			i++;
			}
		
		
		Scanner sc = new Scanner(System.in); 
		while(true) {							//무한루프
			System.out.println("15 x 6 = ???");	//15 x 6 = ???
			System.out.println("> ");
			int answer = sc.nextInt();
			
			if(answer == 90) {					//정답이 90이면
				System.out.println("정답입니다.");
				break;							//멈춰라
			} else if(answer == 0) {			// 0이면 정답을 알려준다.
				System.out.println("정답은 90이었습니다.");
			} else {							//틀리면
				System.out.println("틀렸지롱~!");
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		}
	
		
		
		
		

	}


