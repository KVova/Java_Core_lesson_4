package volodymyr.animal;

public class Animal {

	private String animalName;
	private String animalAge;
	private String animalSpeed;
	
	public Animal(String animalName, String animalAge, String animalSpeed) {
		super();
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.animalSpeed = animalSpeed;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(String animalAge) {
		this.animalAge = animalAge;
	}

	public String getAnimalSpped() {
		return animalSpeed;
	}

	public void setAnimalSpped(String animalSpeed) {
		this.animalSpeed = animalSpeed;
	}

	@Override
	public String toString() {
		return "\"Назва тварини\"= " + animalName + ", \"Вік тварини\"= " + animalAge + ", \"Швидкість тварини\"= " + animalSpeed + "";
	}
	
}
