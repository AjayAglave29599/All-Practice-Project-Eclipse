import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lion {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String breed;
	@Embedded
    private Animal animal;
	public Lion(Animal animal) {
		super();
		this.animal = animal;
	}
	
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(animal, breed, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lion other = (Lion) obj;
		return Objects.equals(animal, other.animal) && Objects.equals(breed, other.breed) && id == other.id;
	}
	@Override
	public String toString() {
		return "Lion [id=" + id + ", breed=" + breed + ", animal=" + animal + "]";
	}
	
	
	
	

}
