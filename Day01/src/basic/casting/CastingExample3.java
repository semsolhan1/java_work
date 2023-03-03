package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		int intResult = c + i;
		char charResult = (char) (c + i);
		
		System.out.println(intResult);
		System.out.println(charResult);
		//서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰쪽에
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행됩니다.
		
		int k = 10;
		double d = (double) k / 4;
		//둘중 하나는 double로 바꿔야 한다.
//		double d = k / 4.0; //도 가능하다.
		System.out.println(d);
		
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
		//int보다 작은 크기의 데이터 연산은 자동으로
		//값의 손상을 막기위해 int로 변환해서 값을 저장해준다.
		
		
	}

}
