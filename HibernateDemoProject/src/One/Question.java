package One;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer qNumber;
	private String qName;
	
	
	
	public Question(String qName) {
		super();
		this.qName = qName;
	}
	public Question(Integer qNumber, String qName) {
		super();
		this.qNumber = qNumber;
		this.qName = qName;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getqNumber() {
		return qNumber;
	}
	public void setqNumber(Integer qNumber) {
		this.qNumber = qNumber;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(qName, qNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return Objects.equals(qName, other.qName) && Objects.equals(qNumber, other.qNumber);
	}
	@Override
	public String toString() {
		return "Question [qNumber=" + qNumber + ", qName=" + qName + "]";
	}
	
	
	
	

}
