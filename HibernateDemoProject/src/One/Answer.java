package One;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aNumber;
	private String aName;
	@OneToOne(cascade = CascadeType.ALL)
	private Question question;
	
	
	public Answer(String aName) {
		super();
		this.aName = aName;
	}
	public Answer(Integer aNumber, String aName, Question question) {
		super();
		this.aNumber = aNumber;
		this.aName = aName;
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getaNumber() {
		return aNumber;
	}
	public void setaNumber(Integer aNumber) {
		this.aNumber = aNumber;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public int hashCode() {
		return Objects.hash(aName, aNumber, question);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		return Objects.equals(aName, other.aName) && Objects.equals(aNumber, other.aNumber)
				&& Objects.equals(question, other.question);
	}
	@Override
	public String toString() {
		return "Answer [aNumber=" + aNumber + ", aName=" + aName + ", question=" + question + "]";
	}
	
	
	
	

}
