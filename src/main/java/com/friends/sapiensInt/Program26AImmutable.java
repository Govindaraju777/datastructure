package com.friends.sapiensInt;

final class A {
	private String s;

	public A(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return s;
	}

	public void setA(String a) {
		this.s += a;
	}

}

public final class Program26AImmutable {
	private final A a;

	public Program26AImmutable(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return a.toString();
	}

	public static void main(String[] args) {
		A a = new A("Bye");
		Program26AImmutable im = new Program26AImmutable(a);

		System.out.print(im);

		a.setA("bye");
		System.out.println(im);
	}
}
