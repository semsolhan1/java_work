package basic.array;

import java.util.Scanner;


public class ArrayInsertQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] foods = new String[50];
		int i;
		outer: for(i=0; i<foods.length; i++) {
			System.out.println("음식이름을 입력하세요: ");
			
			String food = sc.next();
			
		
			
			if(food.equals("배불러")) {
				System.out.println("입력을 종료합니다. ");
				
				
				break;
			}
			int j;
			for(j=0; j<foods.length; j++) {
				if(food.equals(foods[j])) {
					System.out.println("이미 존재하는 음식입니다.");
					i--;
					continue outer;
				}
			}
			
			
			foods[i] = food;
		}
		System.out.println("-----------------------");
		System.out.println("내가 먹고 싶은 음식들: ");
		
		for(String a: foods) {
			if(a == null) break;
			System.out.println(a + " ");
			
		}
		sc.close();
		
		
	}

}
