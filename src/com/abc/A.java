package com.abc;

public class A {

	{
		System.out.println("non-static block");
		
	}
	{
		System.out.println("non-static block");
		
	}
	static
	{
		System.out.println("static block");
	}
public static void main(String args[])
{

	System.out.println("main method start");
	A a = new A();
	System.out.println("main method end");
	A a1 = new A();
	B b = new B();
	B b1 = new B();
}
}
