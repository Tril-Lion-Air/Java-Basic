package arrayListPractice;

import java.util.ArrayList;

public class Student2 {

	private String name;
	private ArrayList<String> subjects;
	private ArrayList<Integer> scores;
	
	public Student2() {}
	public Student2(String name) {
		this.name = name;
		subjects = new ArrayList<String>();
		scores = new ArrayList<Integer>();
	}
	
	public void addSubjectNScore(String subject, int score) {
		subjects.add(subject);
		scores.add(score);

	}
	
	public int totalScore() {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		return sum;
	}
	
	public void showStudentInfo() {
		for(int i=0; i<subjects.size();i++) {
			System.out.println("학생 " + name + "님의 " + subjects.get(i) + " 과목의 성적은 " + scores.get(i) + "점 입니다.");
		}
		System.out.println("학생 " + name + "님의 총점은 " + totalScore() + "점 입니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	public ArrayList<Integer> getScores() {
		return scores;
	}
	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}
	
	
}
