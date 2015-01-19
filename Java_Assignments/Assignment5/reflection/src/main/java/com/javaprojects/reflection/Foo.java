package com.javaprojects.reflection;

class Foo 
{
	int a;
	int b;
	Foo()
	{
		System.out.println("Inside constructor.");
	}
	Foo(int p,int q)
	{
		this.a=p;
		this.b=q;
	}
	public void print() 
	{
		System.out.println("abc");
	}
	public void sum()
	{
		System.out.println("pqr");
	}
}

