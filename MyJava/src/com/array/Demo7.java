//WAP to take i/p from user to print even no's in an array starting from n...
package com.array;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting no: ");
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<a.length;n++)
		{
			if(n%2==0)
			{
				a[i]=n;
				i++;
			}
		}
		System.out.println("array is: ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
