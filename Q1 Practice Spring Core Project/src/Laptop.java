import java.util.Objects;

public class Laptop {
	
	private Long lId;
	private String hdd,ram;
	public Laptop(Long lId, String hdd, String ram) {
		super();
		this.lId = lId;
		this.hdd = hdd;
		this.ram = ram;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getlId() {
		return lId;
	}
	public void setlId(Long lId) {
		this.lId = lId;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hdd, lId, ram);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(hdd, other.hdd) && Objects.equals(lId, other.lId) && Objects.equals(ram, other.ram);
	}
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
	
	
	

}
