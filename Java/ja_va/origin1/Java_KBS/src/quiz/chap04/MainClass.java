package quiz.chap04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<>();
		
		Point p = new Point();
		
		while(true) {
			int menu = p.menuInfo();
			
			switch(menu) {
			case 1:
				p.inputPoints(sList);
				break;
			case 2:
				if(sList.isEmpty()) {
					System.out.println("등록된 학생이 없습니다. 먼저 등록부터 하세요.");
				} else {
					p.showAllPoints(sList);					
				}
				break;
			case 3:
				p.searchPoint(sList);
				break;
			case 4:
				p.modifyPoint(sList);
				break;
			case 5:
				p.deletePoint(sList);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				Student.close();
				p.close();
				System.exit(0); //프로그램 강제 종료 메서드.
				
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			
		}
		
		
		

	}

}
















