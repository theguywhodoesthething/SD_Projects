package zoo;

public class Zoo {
	public static void main(String ... args){
		
		Animal a1 = new Animal("giraffe", 480); //name, weight
		Animal a2 = new Animal("lion", 300, "male"); //name, weight, gender

        a1.makeNoise();
        a2.makeNoise();
        
        System.out.println(a1.getName() + a1.getWeight() + a1.getGender());
        System.out.println(a2.getName() + a2.getWeight() + a2.getGender());
    }
}

//	Screen output:
//
//	lion:NOISE!giraffe:NOISE!
//
//	class Animal available to all packages
//	
//	two ctors to match the code
//	Default gender of "female" (hint: 2-arg ctor can use this() to call 3-arg)
//	makeNoise() method available only to classes in same package
//	getters and setters
//	private member variables