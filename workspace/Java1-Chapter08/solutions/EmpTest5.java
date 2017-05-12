package solutions;

public class EmpTest5 {
    public static void main(String[] args) {
        Employee4 e = new Employee4("Bob", "Dobbs");
        e.setSalary(59900.00F);
        e.setId(42);

        Employee4 e2 = new Employee4("Joan", "Lewis");
        e2.setSalary(60000.00F);
        e2.setId(43);
        
        Employee4 e3 = new Employee4();
        
        e.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
        
    }
}
