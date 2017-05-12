package solutions;

public class EmpTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.firstName = "Bob";
        e.lastName = "Dobbs";
        e.salary = 59900.00F;
        e.id = 42;
        
        e.display();
    }
}
