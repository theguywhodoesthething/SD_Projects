package solutions;

public class Employee {
    String firstName;
    String lastName;
    float salary;
    int id;
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
    }
}
