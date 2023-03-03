package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 입력: 2~4명");
		//게임인원 입력
		int player = sc.nextInt();
		int hit;
		String[] players = new String[player];
		for(int i=0; i<players.length; i++) {
			System.out.println("참가자 성명 입력: ");
			//플레이어 이름 등록
			String playerName = sc.next();
			//배열 하나 생성해서 플레이어들을 배치하면 된다.
			//배열의 크기는 게임 참가자의 명수와 동일합니다.
			players[i] = playerName;

		}
		while(true) {
			System.out.println("실탄 개수 입력:");
			//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
			hit = sc.nextInt();
			if(hit > 6) {
				System.out.println("총알이 흘러 넘칩니다.");
			}else if(hit == 6) {
				System.out.println("6발은 장전하면 재미없잖아!!?");
			}else if(hit == player) {
				System.out.println("너 자신을 사랑하라!!");

			}else if(hit == 0) {
				System.out.println("실탄을 넣지 않았습니다.");

			}else {
				System.out.println("최후의 1인이 누구일지 생각해보십시오!");
				break;
			}


		}
		boolean[] bulletPos = new boolean[6];

		//실탄을 탄창에 배치합니다.

		in:for(int i=0; i<hit; i++) {
			//난수를 생성하셔서 실탄을 탄창에 배치합니다.
			int a = (int)(Math.random()*5);
			
			//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
			//같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
				if(bulletPos[a] == true) {
				i--;
				continue in;

			}
				//false -> true로 바꾸는 것이 실탄장전입니다.
			bulletPos[a] = true;
		}
		//실행순서 정하기
		
		










		//난수를 이용해서 실행 순서를 정합니다.
		//시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.


		//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.




		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여주세요.












	}
	}






















