import java.util.Objects;

public class Employee {
	
	private Integer eid;
	private String eName;
	private String ephone;
	
	private Laptop laptop;

	public Employee(Integer eid, String eName, String ephone, Laptop laptop) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.ephone = ephone;
		this.laptop = laptop;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEphone() {
		return ephone;
	}

	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, eName, ephone, laptop);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(eid, other.eid) && Objects.equals(eName, other.eName)
				&& Objects.equals(ephone, other.ephone) && Objects.equals(laptop, other.laptop);
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + eid + ", eName=" + eName + ", ephone=" + ephone + ", laptop=" + laptop + "]";
	}
	
	

}
