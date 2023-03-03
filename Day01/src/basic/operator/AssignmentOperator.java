package basic.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		/*
		 # 대입 연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /=, %=)
		 - 변수에 값을 대입할 때 사용하는 연산자 입니다.
		 - 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태입니다.
		*/
		
		int a = 5;
		int b = 5;
		
		a += 3; // a = a + 3
		System.out.println(a);
		
		System.out.println("-----------------------");
		
		a -= 4;// 기존 값의 4를 뺀 값을 a 넣은 값 : 4
		System.out.println(a);
		
		a *= 6;// 기존 4의 값을 곱한 6을 넣은 값 : 24
		System.out.println(a);
		
		a /= 5;// 기존 24의 값을 5로 나눈 값 : 4
		System.out.println(a);
		
		a %=3;// 기존 4의 값을 3으로 나눈 값 : 1
		System.out.println(a);
		//복합연산자
		
		
		
	}

}
