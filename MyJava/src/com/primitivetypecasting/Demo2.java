package com.primitivetypecasting;

public class Demo2 {
		static void print(double x)
		{
			System.out.println(x);
		}
		static void print(int x)
		{
			System.out.println(x);
		}
		public static void main(String[]args)
		{
			print('c');
			print(10.0f);
			print(10);
		}
}
