package solutions;

public class EmpTest8 {
    public static void main(String[] args) {
        Employee8 e = new Employee8("Bob", "Dobbs", Title.MANAGER);
        e.setSalary(59900.00F);
        e.setId(42);

        Employee8 e2 = new Employee8("Joan", "Lewis", Title.CEO);
        e2.setSalary(60000.00F);
        e2.setId(43);
        
        Employee8 e3 = new Employee8();
        
        e.display();
        e2.display();
        e3.display();
    }
}
