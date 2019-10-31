package com.staticmembers;
//demo for static variable
public class Sm2 {
	static int i=10;
	public static void main(String[] args) {
		System.out.println(i);//10
		i=20;
		System.out.println(i);//20
	}

}
