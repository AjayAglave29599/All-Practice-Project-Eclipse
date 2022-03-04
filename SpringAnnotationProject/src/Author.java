import java.util.Objects;

public class Author {
	
	private Integer authorId;
	private String name;
	public Author(Integer authorId, String name) {
		super();
		this.authorId = authorId;
		this.name = name;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(authorId, other.authorId) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + "]";
	}
	
	

}
