package basic.begin;

public class ShortCharCompare {

	public static void main(String[] args) {
		
		char a = 'A';
		short b = 10;
		char testing = (char) (a + b);
		short shorting = (short) (b + a);
		System.out.println(testing);
		System.out.println(shorting);
		//서로 다운캐스팅을 한다.
		
	}

}
