package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;
		
		//boxing: 기본 데이터타입을 객체 타입으로 변환하는 과정(권장 x)
		Integer v1 = new Integer(a);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);
		
		//autoboxint: 기본 타입을 자동으로 객체형으로 변환.
		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;
		
		//autounboxing: 객체 포장을 기본형으로 해제 가능.
		int a1 = x1;
		boolean b2 = x2;
		double d3 = x4;
		char c3 = x3;
		
		//AutoBoxint 이후에 wrapper 클래스는 문자열을 기본형으로 
		//변환하는 데 많이 사용됩니다.
		
		//해당 타입으로 변환할 수 없는 문자열을 시도했을 경우
		//NumberFormatException 예외가 발생합니다.
		String s2 = "3.14";
//		Integer.parseInt(s2);
		
		
		
	}

}
