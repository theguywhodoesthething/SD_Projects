package solutions;

public class Employee5 {
    static int retirementAge = 65;
    static float minimumWage = 10.0F;
    
    private String firstName;
    private String lastName;
    private float salary;
    private int id;
  
    // constructors
    public Employee5(String fname, String lname) {
        firstName = fname;
        lastName = lname;
    }

    public Employee5() {
        this("J.", "Doe");
    }
    
    // methods
    public void display() {
        System.out.println("Employee " + "(Min Wage: " + minimumWage
                + ", Ret Age: " + retirementAge + "):");
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
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

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", id=" + id
				+ "]";
	}
}
