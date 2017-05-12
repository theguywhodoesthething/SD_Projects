package solutions;

public class EmpTest6 {
    public static void main(String[] args) {
        Employee5 e = new Employee5("Bob", "Dobbs");
        e.setSalary(59900.00F);
        e.setId(42);

        Employee5 e2 = new Employee5("Joan", "Lewis");
        e2.setSalary(60000.00F);
        e2.setId(43);
        
        Employee5 e3 = new Employee5();
        
        System.out.println(e);
        System.out.println();
        System.out.println(e2);
        System.out.println();
        System.out.println(e3);
        
    }
}
