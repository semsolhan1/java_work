package basic.myexample;

import java.util.Scanner;

public class MyExample2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		int num = sc.hashCode();
		int cnt = 0;
		
		for(int i=2; i<=num; i++) {
		int count = 0;
			for(int j=2; j<=i; i++) {
				if(i % j ==0) {
					count++;
					
					
				}
				
			}
			if(count == 2) {
				System.out.println(i + "소수");
				cnt++;
				
			}
		}
		System.out.println("소수는" + cnt + "개 입니다.");
		
		
		sc.close();
		
		
		
	}
}
