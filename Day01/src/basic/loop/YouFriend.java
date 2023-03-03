package basic.loop;

import java.util.Scanner;

public class YouFriend {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("입력값: ");
	int n = sc.nextInt();
//	int total = 0;
	for(int i=2; i<=n; i++) {
		boolean isPrime = true;
//		System.out.println("i: " + i);
		for(int j=2; j<=i/2; j++) {
//			System.out.println("j: " + j);
			
			if(i % j == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("소수는 : " + i + "이다.");
//			total += 1;
			
		}
	}
//	System.out.println("갯수 : " + total);
	
	
	
	
}


}
