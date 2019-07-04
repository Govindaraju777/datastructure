package com.friends.sapiensInt;

class Mid {
	public int finMid(int n1, int n2) {
		return (n1 + n2) / 2;
	}
}

public class Calc extends Mid {
	public static void main(String[] args) {
		int n1 = 22, n2 = 2;
		//insert code here..
		
		Calc cal= new Calc();
		int n3=cal.finMid(n1, n2);
		//n3 = super.finMid(n1, n2);  // Compiler error super can be used for object 
							//not static
		//Calc c = new Mid();  // child reference cannot refer parent object
		
		Mid m1 = new Calc();
		m1.finMid(n1, n2);

		//Calc.fin //
		//Mid.finMid(1,2);
		
		System.out.println(n3);
	}
}