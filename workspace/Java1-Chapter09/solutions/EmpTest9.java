package solutions;

public class EmpTest9 {
    public static void main(String[] args) {
        Employee9 e = new Employee9("Bob", "Dobbs", Title.MANAGER);
        e.setSalary(59900.00F);
        e.setId(42);

        Employee9 e2 = new Employee9("Joan", "Lewis", Title.CEO);
        e2.setSalary(60000.00F);
        e2.setId(43);
        
        Employee9 e3 = new Employee9();
        
        System.out.println(e);
        System.out.println();
        System.out.println(e2);
        System.out.println();
        System.out.println(e3);
    }
}
