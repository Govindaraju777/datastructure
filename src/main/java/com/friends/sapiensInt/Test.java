package com.friends.sapiensInt;

public class Test {
	public static void main(String[] args) {
		Base x = new Base();
		Base y = new Derived();
		Derived z = new Derived();

		x.print();
		y.print();
		z.print();
	}
}

class Base {
	public void print() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void print() {
		System.out.println("Derived");
	}

}