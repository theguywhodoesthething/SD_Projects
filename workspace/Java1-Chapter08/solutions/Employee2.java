package solutions;

public class Employee2 {
    static int retirementAge = 65;
    static float minimumWage = 10.0F;
    
    String firstName;
    String lastName;
    float salary;
    int id;

    public void display() {
        System.out.println("Employee " + "(Min Wage: " + minimumWage
                + ", Ret Age: " + retirementAge + "):");
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
    }
}
