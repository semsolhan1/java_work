package basic.begin;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: \n");
		String name = sc.next();
		System.out.print("나이: \n");
		int age = sc.nextInt();
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		
				
		sc.close();
		
		
		
	}

}
