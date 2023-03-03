package basic.myexample;

import java.util.Scanner;

public class HotAndIce {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("hot & ice: ");
		String ice = sc.next();
		System.out.println("coffee: ");
		String coffee = sc.next();
		
		switch(ice) {
		case "h":
			ice = "따뜻한";
			break;
		case "i":
			ice = "아이스";
			break;
		}
		switch(coffee) {
		case "c":
			coffee = "커피";
			break;
		case "t":
			coffee = "차";
			break;
			
			
		}
		System.out.printf("%s%s입니다.", ice, coffee);
		
		
		sc.close();
		
		
		

	}

}
