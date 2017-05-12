package solutions;

public class EmpTest4 {
    public static void main(String[] args) {
        Employee3 e = new Employee3();
        e.setFirstName("Bob");
        e.setLastName("Dobbs");
        e.setSalary(59900.00F);
        e.setId(42);

        Employee3 e2 = new Employee3();
        e2.setFirstName("Joan");
        e2.setLastName("Lewis");
        e2.setSalary(60000.00F);
        e2.setId(43);
        
        e.display();
        System.out.println();
        e2.display();
    }
}
