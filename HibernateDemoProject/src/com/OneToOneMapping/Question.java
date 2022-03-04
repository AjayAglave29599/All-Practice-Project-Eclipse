package com.OneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int questionId;
	private String question;
	@OneToOne(cascade = CascadeType.ALL)
	private Answer answer;

	public Question(int questionId, String question, Answer address) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = address;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer address) {
		this.answer = address;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", address=" + answer + "]";
	}
	
	

	
	
	

}
