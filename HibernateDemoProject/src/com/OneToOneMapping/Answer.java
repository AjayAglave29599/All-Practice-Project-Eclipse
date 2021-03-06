package com.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	private int answerid;
	private String answer;
	public Answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Address [answerid=" + answerid + ", answer=" + answer + "]";
	}
	
	
	

}
