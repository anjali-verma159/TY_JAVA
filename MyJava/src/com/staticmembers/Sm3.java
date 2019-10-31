package com.staticmembers;

public class Sm3 {
	static int i=10;

	public static void main(String[] args) {
		System.out.println(i);//10
		i=20;
		System.out.println(Sm3.i);//20
		Sm3.i=50;
		System.out.println(Sm3.i);//50
	}

}
