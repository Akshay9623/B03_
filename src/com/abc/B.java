package com.abc;

public class B {
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("non-static block");
	}
}
