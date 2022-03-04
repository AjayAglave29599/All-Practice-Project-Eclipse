import java.util.Objects;

public class Person {
	
	private int PersonId;
	private String PersonName;
	private String PersonAddress;
	private String PersonPhone;
	public Person(int personId, String personName, String personAddress, String personPhone) {
		super();
		PersonId = personId;
		PersonName = personName;
		PersonAddress = personAddress;
		PersonPhone = personPhone;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPersonId() {
		return PersonId;
	}
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getPersonAddress() {
		return PersonAddress;
	}
	public void setPersonAddress(String personAddress) {
		PersonAddress = personAddress;
	}
	public String getPersonPhone() {
		return PersonPhone;
	}
	public void setPersonPhone(String personPhone) {
		PersonPhone = personPhone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(PersonAddress, PersonId, PersonName, PersonPhone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(PersonAddress, other.PersonAddress) && PersonId == other.PersonId
				&& Objects.equals(PersonName, other.PersonName) && Objects.equals(PersonPhone, other.PersonPhone);
	}
	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", PersonName=" + PersonName + ", PersonAddress=" + PersonAddress
				+ ", PersonPhone=" + PersonPhone + "]";
	}
	
	

}
