package ykid180524;

public class Ch6_18_Exercise {
	String name;
	int assigmentScore; //과제점수
	int examScore; //시험점수
	
	/*Ch6_18_Exercise(){
		
	}
	
	Ch6_18_Exercise(String name, int assigmentScore, int examScore){
		this.name=name;
		this.assigmentScore=assigmentScore;
		this.examScore=examScore;
	}*/
	
	public void result() {
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
