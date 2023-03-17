package oop.obj_arr;

public class Score {
	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double scores;
	
	public Score(String name, int eng, int mat, int kor) {
		super();
		this.name = name;
		this.eng = eng;
		this.mat = mat;
		this.kor = kor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTotal() {
		total = eng + mat + kor;
		return total;
	}

	

	public double getScores() {
		scores = total / 3.0;
		return scores;
	}


	
	
	
	void scoreInfo() {
		System.out.printf("이름: %s\n영어: %d\n수학: %d\n국어: %d\n총점: %d\n평균: %.2f\n", name, eng, mat, kor, getTotal(), getScores());
		
	}
	
	
}
