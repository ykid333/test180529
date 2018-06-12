package ykid_Ch06;

public class Ch6_19_Excercise2 {
	
	private String name;
	private int assigmentScore; //과제점수
	private int examScore; //시험점수
	
	public String getName() {
		return name;
	}
	public int getAssigmentScore() {
		return assigmentScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAssigmentScore(int assigmentScore) {
		this.assigmentScore = assigmentScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	
	void result() {
		System.out.println("이름 : "+this.name);
		System.out.println("과제점수 : "+this.assigmentScore);
		System.out.println("시험점수 : "+this.examScore);
		
		if(examScore>90) {
			System.out.println("학점 : A");
		}else {
			System.out.println("학점 : B");
		}
		System.out.println();
		
	}
}
