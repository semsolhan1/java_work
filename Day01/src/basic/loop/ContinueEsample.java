package basic.loop;

public class ContinueEsample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				continue; //5를 만나면 5의 출력을 건너뛴다.
			}
			System.out.println(i + " ");
			
			
		}
		System.out.println("\n반복문 종료!");
		
		
		

	}

}
