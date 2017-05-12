package labs;

public class EmpTest {
	public static void main(String[] args) {
		
		Employee newGuy = new Employee("Matt", "Gmur");
		
//		newGuy.setFirstName("Matt");
//		newGuy.setLastName("Gmur");
		
		newGuy.setSalary(100000);
		newGuy.setEmployeeId(45);
		newGuy.setTitle(Title.BARBER);
		
		System.out.println(newGuy.display());
		
		Employee newestGuy = new Employee("Matt", "Gmur");
		
//		newGuy.setFirstName("Matt");
//		newGuy.setLastName("Gmur");
		
		newestGuy.setSalary(100000);
		newestGuy.setEmployeeId(45);
		newestGuy.setTitle(Title.SECRET_AGENT);
		
		System.out.println(newestGuy.display());
		
		Employee newerGuy = new Employee("James", "Bond");
		
//		newerGuy.setFirstName("James");
//		newerGuy.setLastName("Bond");
		
		newerGuy.setSalary(1E6);
		newerGuy.setEmployeeId(007);
		newerGuy.setTitle(Title.BOSS);
		
		System.out.println(newerGuy.display());
		
		Employee noName = new Employee();
		
		System.out.println(noName.display());
		
		System.out.println(newGuy);
		System.out.println(newerGuy);
		
		System.out.println(newGuy.toString());
		System.out.println(newerGuy.toString());
		
		Employee[] empArr = new Employee[3];
		
		empArr[0] = newGuy;
		empArr[1] = newerGuy;
		empArr[2] = newestGuy;
		
		for (int i = 0; i < empArr.length; i++){
			
			if (empArr.length == i+1) {
				System.out.print(empArr[i]);
				System.out.print(" =? ");
				System.out.println(empArr[0]);
				System.out.println( empArr[i].equals(empArr[0]) );
			}
			else {
				System.out.print(empArr[i]);
				System.out.print(" =? ");
				System.out.println(empArr[i+1]);
				System.out.println( empArr[i].equals(empArr[i+1]) );
			}
		}
		
	}
}
