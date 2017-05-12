package topicassigner;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TopicAssignerImp {

static class StaticTest{
	
	int x;
	static int y;
    
    void m1(){
        StaticTest.m2();  // 1
        m4();             // 2
//        StaticTest.m3();  // 3
    }
    
    static void m2(){ }  // 4
    
    void m3(){
        m1();            // 5
        m2();            // 6
//        StaticTest.m1(); // 7
    }
    
    static void m4(){ }
}

public static void main(String[] args) {
		
//	System.out.println(StaticTest.x);
	System.out.println(StaticTest.y);
	
	StaticTest.m2();
	
	double pc = 78;
		
	}
//		
//		TopicAssigner tp = new TopicAssigner();
//		Scanner kb = new Scanner(System.in);
//		String fileName, delimiter, list;
//		
////		if (args.length == 6) {
////			tp.readInput(args[0], args[1], args[2]);
////			tp.readInput(args[3], args[4], args[5]);
////		} else {
////			System.out.println("Please enter your students filename:");
////			fileName = kb.nextLine();
////			System.out.println("Please enter your students delimiter:");
////			delimiter = kb.nextLine();
//			tp.readInput("Students.txt","students");
////			
////			System.out.println("Please enter your topics filename:");
////			fileName = kb.nextLine();
////			System.out.println("Please enter your topics delimiter:");
////			delimiter = kb.nextLine();
//			tp.readInput("Topics.txt", "topics");
////		}
//		
//		Map<String,String> results = tp.shuffleMatch();
//		
//		Set<String> keys = results.keySet();
//		
//		for(String k: keys) {
//			System.out.println(results.get(k).toString() + ": " + k.toString());
//		}
//		
//		kb.close();
//		
//	}

}
