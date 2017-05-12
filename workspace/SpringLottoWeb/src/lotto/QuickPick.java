package lotto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickPick {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");

	      Hopper h = context.getBean("lottery", Hopper.class);
	      h.reset();
	      System.out.println(h.getName());
	      for (int i = 0; i < 6; i++) {
	    	  	System.out.print(h.drawBall().getValue() + " ");
	      }
	      System.out.println();
	      
	      context.close();
	}
}
