package employeemenu;

import java.util.Arrays;

public class Employee {
    
    private String firstName;
    private String lastName;
    private double salary;
    private String email;
    private int[] employeeID;
    private Title title;
    
    public Employee(){
        this("J", "Doe", Title.INTERN);
    }
    
    
    public Employee(String firstName, String lastName, Title title) {
    	
    	int[] c = new int[4];
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        
        switch(title) {
        	case BOSS: this.salary = 1E6;
        		break;
        	case DEV1: this.salary = 1.5E5;
        		break;
        	case DEV2: this.salary = 1E5;
        		break;
        	case INTERN: this.salary = 5E4;
        		break;
        	case JANITOR: this.salary = 3E4;
        		break;
        	default: this.salary = 0;
        }
        
        if (this.firstName != null)
        	this.email = firstName.toLowerCase().charAt(0) + lastName.toLowerCase() + "@bestjobever.com";
        
        if (this.firstName != null) {
        	
        	for (int i = 0; i < c.length; i+=2) {
        		c[i] += firstName.charAt(i);
        		c[i+1] += lastName.charAt(i);
        	}
        	
        	this.employeeID = c;
        }
    }

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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int[] getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int[] employeeID) {
		this.employeeID = employeeID;
	}


	public Title getTitle() {
		return title;
	}


	public void setTitle(Title title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName = ");
		builder.append(firstName);
		builder.append("\t lastName = ");
		builder.append(lastName);
		builder.append("\t salary = ");
		builder.append(salary);
		builder.append("\t email = ");
		builder.append(email);
		builder.append("\t employeeID = ");
		builder.append(Arrays.toString(employeeID));
		builder.append("\t title = ");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}
}