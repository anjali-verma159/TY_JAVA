package com.assignment;

public class Assign4 {

	public static void main(String[]args) 
	{
		int n=333;
		int size=7;
		int[]arr=new int[size];
			for(int i=0;i<=arr.length;n++)
			{
				if(isPrime(n))
				{
					arr[i++]=n;
				}
			}
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	static boolean isPrime(int n)
	{
		int count=2;
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			return true;
		}
			else
			return false;
	}
}
