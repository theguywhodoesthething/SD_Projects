package labs;

import java.util.*;

public class Students {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Matt"));
		studentList.add(new Student("Mark"));
		studentList.add(new Student("Josh"));
		studentList.add(new Student("Brian"));
		studentList.add(new Student("Fred"));
		studentList.add(new Student("Harry"));
		studentList.add(new Student("Albert"));
		studentList.add(new Student("Joe"));
		
		System.out.println(studentList.toString());
		System.out.println(studentList.size());

	}

}
