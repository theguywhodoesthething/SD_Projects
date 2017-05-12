package solutions;

public class EmpTest3 {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        e.firstName = "Bob";
        e.lastName = "Dobbs";
        e.salary = 59900.00F;
        e.id = 42;
        
        Employee2 e2 = new Employee2();
        e2.firstName = "Joan";
        e2.lastName = "Lewis";
        e2.salary = 60000.00F;
        e2.id = 43;
        
        e.display();
        System.out.println();
        e2.display();
    }
}
