//program to store the value in the array and increase the value by 10
package com.array;

public class Demo5 {

	public static void main(String[] args) {
			int[]x= {10,2,4,20};
			for (int index=0;index<x.length;index++)
			{
				System.out.println(x[index]);
			}
			System.out.println("after adding 10");
			for(int i=0;i<x.length;i++)
			{
				x[i]=x[i]+10;
				System.out.println(x[i]);
			}
			
			/*for (int index=0;index<x.length;index++)
			{
				
			}*/
			

	}

}
