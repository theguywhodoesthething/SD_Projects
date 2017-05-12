package labs;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	private int employeeId;
	private Title title;
	public static double minimumWage = 40000;
	public static int retirementAge = 65;
	
	public Employee (String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee () {
		this.firstName = "J.";
		this.lastName = "Doe";
	}
	
	
	
	// getters for all private variables
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (title != other.title)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", employeeId="
				+ employeeId +", title=" + title + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getsalary() {
		return salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public Title getTitle() {
		return title;
	}
	
	// setters for all private variables
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	
	public String display() {
		String toDisplay = "";
		
		toDisplay = firstName + " " + lastName + " Salary: " + salary + " Employee ID: " + employeeId + ".";
		toDisplay += "\nYou are " + (salary - 40000) + " above the minimum wage.";
		toDisplay += "\nThe retirement age is " + (retirementAge);
		
		return toDisplay;
	}

}
