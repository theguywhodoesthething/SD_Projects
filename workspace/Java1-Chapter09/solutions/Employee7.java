package solutions;

public class Employee7 {
	static int retirementAge = 65;
	static float minimumWage = 10.0F;

	private String firstName;
	private String lastName;
	private float salary;
	private int id;
	private Title title;

	// constructors
	public Employee7(String fname, String lname, Title t) {
		firstName = fname;
		lastName = lname;
		title = t;
	}

	public Employee7() {
		this("J.", "Doe", Title.PROGRAMMER);
	}

	// methods
	public void display() {
		System.out.println("Employee " + "(Min Wage: " + minimumWage + ", Ret Age: " + retirementAge + "):");
		System.out.println("ID: " + id);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Salary: " + salary);
		System.out.println("Title: " + title);
	}

	// gets and sets
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", id=" + id
				+ ", title=" + title + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee7 other = (Employee7) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		if (title != other.title)
			return false;
		return true;
	}
}
