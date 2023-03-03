package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		- 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		(promotion, UpCasting)
		*/
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		char c = 'A';
		int j = c;
		System.out.println("A의 문자 번호: " + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		//서로 다른 타입으로 int의 값은 변환하지 않고 double타입으로
		//변화하면서 500.0인 double타입을 준비한다.
		

	}

}
