package solutions;

public class EmpTest2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.firstName = "Bob";
        e.lastName = "Dobbs";
        e.salary = 59900.00F;
        e.id = 42;
        
        Employee e2 = new Employee();
        e2.firstName = "Joan";
        e2.lastName = "Lewis";
        e2.salary = 60000.00F;
        e2.id = 43;
        
        e.display();
        System.out.println();
        e2.display();
    }
}
