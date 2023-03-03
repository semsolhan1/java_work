package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
	System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
	String name = sc.next();
	
//	for(int i=0; i<kakao.length-1; i++) {
//		System.out.println(Arrays.toString(kakao));
//		if(name.equals(kakao[i])) {
////			for(int k=1; k<kakao.length-1; k++) {
//			kakao[i] = kakao[i+1];
//			System.out.println(Arrays.toString(kakao));
////			}
//		}
//	}
//	String[] temp = new String[kakao.length-1];
//	for(int j=0; j<kakao.length; j++) {
//		temp[j] = kakao[j];
//		
//		kakao = temp;
//		
//		System.out.println("삭제가 되었습니다." + Arrays.toString(kakao));
//	}
	
	boolean flag = false;
	for(int i=0; i<kakao.length; i++) {
		if(name.equals(kakao[i])) {
			flag = true;
			for(int j=i; j<kakao.length-1; j++) {
				kakao[j] = kakao[j+1];
			}
			break;
			
		}
	}
	if(!flag) {
		System.out.println(name + "은(는) 없는 이릅입니다.");
	}else {
		String[] temp = new String[kakao.length-1];
		for (int k=0; k<temp.length; k++) {
			temp[k] = kakao[k];
			
		}
		kakao = temp;
		temp = null;
		System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
	}
	
	
	
	/*
	1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
	
	2. 이름받은 이름이 없다면 없다고 얘기해 주세요.
	*/	
		
		
		

	}

}
























