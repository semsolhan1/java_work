package etc.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		/*
		# Set
		- 집합을 구현해 좋은 인터페이스
		- 요소로 같은 값이 들어오는 것을 허용하지 않는다.
		
		# Hash
		- 어떤 값을 넣었을 때 전혀 예측하지 못할 값이 생성되어야 하는 알고리즘
		- 예측할 수 없는 값을 이용하기 때문에 정렬이 불가능.
		- 생성된 값으로 원래 값을 찾는 것도 불가능에 가깞다.
		- 다시 원래 값으로 돌아갈 수 없는 단방향성 알고리즘
		- 속도가 빠르고 보안성이 뛰어난 알고리즘. 객체의 주소값을 할당하거나
		 암호화 알고리즘에서 많이 사용됩니다.
		*/
		
		Set<String> set = new HashSet<>();
		
		//객체를 저장: add(객체) 중복허용이 안된다.
		set.add("JAVA");
		set.add("JSP");
		set.add("Spring");
		set.add("Oracle");
		Collections.addAll(set, "Mysql", "JAVA");
		System.out.println(set);
		
		//set의 크기 확인 하기: size()
		System.out.println("set의 크기: " + set.size());
		
		/*
		- set은 인덱스가 없기 때문에 메서드를 이용해서 객체를 얻는게 아니라
		 반복자 (Iterator)를 통해서 요소를 하나씩 꺼내 보셔야 합니다.
		 반복자 객체는 set 인터페이스가 제공하는 iterato()를 호출하여
		 얻어옵니다.
		*/
		
		Iterator<String> iter = set.iterator();
		
		/*
		Iterator 객체의 메서드 next()를 통해
		내부 요소를 하나씩 꺼내올 수 있습니다.
		next()를 요소의 개수보다 많이 호출하게 되면
		NoSuchElement 예외가 발생합니다.
		
		hasNext() -> 반복자가 가지고 있는 객체를 더 가지고 올 수 있는지의
		여부를 확인하는 메서드를 통해 next()를 호출하셔야 합니다.
		*/
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
			
		}
		
		System.out.println("---------------------");
		
		for(String s : set) {
			System.out.println(s);
			
		}
		
		
		//set에서 객체를 삭제:remove(객체)
		set.remove("JSP");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
	}

}
