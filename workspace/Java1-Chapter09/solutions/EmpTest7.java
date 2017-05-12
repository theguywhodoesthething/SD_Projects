package solutions;

public class EmpTest7 {
    public static void main(String[] args) {
        Employee7 e = new Employee7("Bob", "Dobbs", Title.MANAGER);
        e.setSalary(59900.00F);
        e.setId(42);

        Employee7 e2 = new Employee7("Joan", "Lewis", Title.CEO);
        e2.setSalary(60000.00F);
        e2.setId(43);
        
        Employee7 e3 = new Employee7();
        
        System.out.println(e);
        System.out.println();
        System.out.println(e2);
        System.out.println();
        System.out.println(e3);
    }
}
