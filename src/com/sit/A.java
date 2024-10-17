package com.sit;

public class A {
	int a=10;
public void m1()
{
	System.out.println("m1------A");   // m1----A
	B b = new B();
	System.out.println(b);
	System.out.println(b.b);           // 20
	b.m2();
}
public static void main(String args[])
{
		A a = new A();
		int x =a.a;
		a.m1();
		System.out.println(x);  // 10
		
}
}
