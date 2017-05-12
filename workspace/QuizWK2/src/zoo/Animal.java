package zoo;

public class Animal {

	private String gender;
	private String name;
	private int weight;
	
	public Animal(String name, int weight, String gender) {
		this.name = name;
		this.weight = weight;
		this.gender = gender;
	}
			
	public Animal(String name, int weight) {
		this(name, weight, "female");
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	void makeNoise() {
		System.out.println(name + ":NOISE!");
	}

}
