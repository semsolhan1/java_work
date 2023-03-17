package etc.api.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bufferedWriterEx {

	public static void main(String[] args) {
		/*
		# Buffered I/O
		- 버퍼를 이용해서 읽기/쓰기  성능을 향상시키는 클래스.
		- 버퍼: 데이터를 입/출력 하기 전에 임시로 저장해 두는 배열 형태의 공간.
		
		# 버퍼를 이용해야 하는 이유
		- 버퍼를 사용하지 않으면 입/출력이 너무 자주 일어난다.
		ex)
			"Java Programming"을 쓰는 경우
			-> 기본  OutputStream을 사용하면 한글자씩 16번의 출력이 발생.
			-> 버퍼에 저장해 놓고 한번에 쓰면 한 번의 출력으로 끝나지 않을까요?
		*/
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("C:\\practice\\file\\merong2.txt");
			bw = new BufferedWriter(fw);
			
			System.out.println("첫 문장: ");
			String str1 = sc.nextLine();
			
			System.out.println("두번째 문장: ");
			String str2 = sc.nextLine();
			
			bw.write(str1 + "\r\n" + str2);
			
			System.out.println("정상 출력 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
