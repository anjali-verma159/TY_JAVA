//wap to design a method to perform the product of 2int, 3int, 2double
package com.assignment;

public class assign1 {

	public static void main(String[]args)
	{
		isProduct(10,20);
		isProduct(20, 30, 40);
		isProduct(10.0,15.2);
	}
		static void isProduct(int a,int b)
		{
			System.out.println(a*b);
		}
		static void isProduct(int a,int b,int c)
		{
			System.out.println(a*b*c);
		}
		static void isProduct(double a,double b)
		{
			System.out.println(a*b);
		}
}
