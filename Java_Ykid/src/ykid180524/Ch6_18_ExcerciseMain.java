package ykid180524;

public class Ch6_18_ExcerciseMain {
	
	public static void main(String[] args) {
		
		Ch6_18_Exercise stud1 = new Ch6_18_Exercise();
		
		stud1.name = "선남"; //이름
		stud1.assigmentScore = 91; //과제점수
		stud1.examScore = 84; //시험점수
		stud1.result();
		
		Ch6_18_Exercise stud2 = new Ch6_18_Exercise();
		
		stud2.name = "선녀"; //이름
		stud2.assigmentScore = 86; //과제점수
		stud2.examScore = 95; //시험점수
		stud2.result();
		
		
		Ch6_19_Excercise2 stud3 = new Ch6_19_Excercise2();
		
		stud3.setName("흔남");
		stud3.setAssigmentScore(99);
		stud3.setExamScore(99);
		stud3.result();
	}

}
