//"Method Overloading" with same name but different arguments
package com.primitivetypecasting;

public class Demo3 {
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public static int sum(int a,int b,int c)
	{
		return (a+b+c);
	}

	public static void main(String[] args) {
		{
			sum(10,20);
		}
		// TODO Auto-generated method stub

	}

}
