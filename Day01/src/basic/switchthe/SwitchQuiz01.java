package basic.switchthe;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		/*
		- 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해주시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int fir = sc.nextInt();
		System.out.println("연산자를 입력해주세요 [+, -, *, /]: ");
		String oper = sc.next();
		System.out.println("정수2: ");
		int tir = sc.nextInt();
		int result = 0;
		boolean flag = true;
		/*
		switch (oper) {
		case "+":
			System.out.println("값은: " + (fir - tir));
			break;
		case "-":
			System.out.println("값은: " + (fir - tir));
			break;
		case "*":
			System.out.println("값은: " + (fir * tir));
			break;
		case "/":
			System.out.println("값은: " + (fir / tir));
			break;
			default:
				System.out.println("연산자를 잘못 입력하셨습니다.");
		 */
		switch (oper) {
		case "+":
			result = fir + tir;
			break;
		case "-":
			result = fir - tir;
			break;
		case "*":
			result = fir * tir;
			break;
		case "/":
			if(tir == 0) { //조건으로 실행될 때 flag = false이다.
				System.out.println("0으로는 나눌수 없습니다.");
				flag = false;
				break;
			} 
			result = fir / tir;
			break;
		default: //디폴트값이 실행될 때 flag = false이다.
			System.out.println("연산자를 잘못 입력하셨습니다.");
			flag = false;
			break;
		}
		if(flag) {//flag는 false일 때 동작을 하지 않는다.
			      //위의 case 미실행시 초기값이 true이므로 flag가 true가 되어서 실행이 된다.			
			System.out.printf("값은: %d", result);
		}
		sc.close();


	}

}
