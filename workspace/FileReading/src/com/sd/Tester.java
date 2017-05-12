package com.sd;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		WhatHappens x = new WhatHappens();
//		WhatHappens y = new WhatHappens2();
		WhatHappens z = new WhatHappens3();
		
		System.out.println(x.theTest());
		System.out.println(y.theTest());
		System.out.println(z.theTest());
	}
}

class WhatHappens {
	static public Object theTest() {
		return new StringBuilder("?") + "Hellow";
	}
}

class WhatHappens2 extends WhatHappens{
	
public Integer theTest() {
		return 4;
	}
}
//
//class WhatHappens3 extends WhatHappens2 {
//	
//	{newMeth();}
		

