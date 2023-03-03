package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		/*
		 # 변수 (variable)
		 
		 1.변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		 2.변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
		 적당한 데이터 타입을 선언해야 합니다.
		 ex) int: 4바이트의 정수, String: 문자열(문장)
		 3.변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 4.변수 내부의 값은 언제든지 변경이 가능합니다.
		 */
		//변수의선언 : [자료형(데이터타입)] [변수명];
		int age;
		//변수의 초기화: [변수명] = [값];
		// = 할당한다라는 뜻으로 불린다.
		//좌측의 영역(age)에다가 우측에 있는 값(40)을 넣는다라고
		//생각을 해야된다.
		
		age = 40;
		System.out.println(age);
		
		//변수는 선언과 초기화를 동시에 할 수 있습니다.
		//(처음 만들 때 한번만 가능합니다.)
		
		int score = 90;
		//int score = 95; (x)
		score = 95;
		System.out.println(score);
		//변수 하나당 값을 하나밖에 대입할 수 없기 때문에
		//기존 값이 소멸하고 새로운 값이 할당됩니다.
		
		//변수에는 다른 변수의 값도 저장이 가능합니다.
		int myScore = score - 20;
		System.out.println(myScore);
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int count = "한번"; (x)
//		int count = 23.5;  (x)
//		String str = 100; (x)
		
		//변수는 자료형(데이터 타입)이 달라도 이름이 동일하면
		//중복 선언할 수 없습니다.
		String name = "홍길동";
//		int name = 1004; (x)
		
		//선언 및 초기화하지 않은 변수는 사용이 불가능합니다.
//		int result = myScore + mum; (x)
		int result;
//		System.out.println(result); (x)
		//값을 넣어주지 않은 변수는 사용이 불가능하다.
		
		
		

	}

}
