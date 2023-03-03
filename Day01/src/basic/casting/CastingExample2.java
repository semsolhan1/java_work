package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값: " + c);
		//다운케스팅 : 내릴 타입을 강제로 맞춰야 한다.
		
		double d = 4.98765;
		int j = (int) d;
		System.out.println(j);
		//int는 소숫점 이하를 표현할 수 없으므로 4가 나타난다.
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		//값의 손실이 발생할 수 있기 때문에 자동으로 내려주지 않는다.
		/*
		 - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
		 반드시 형 변환 연산자: (type)를 사용하여 명시적으로 형
		 변환을 진행해 주셔야 합니다. (DownCasting)
		 
		 - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
		 저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
		 (overflow, underflow)
		*/
		
		

	}

}
