//wap to store the value in the array in reversing order
package com.array;

public class Demo6 {

	public static void main(String[] args) {
		int size=5;
		int[]array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		//Accessing and storing natural no's till last index
		for(int i=0, j=1;i<array.length;i++)
		{
			array[i]=j++;
			System.out.println(array[i]);
		}
		System.out.println("array in reverse order");
		for(int i=array.length-1;i>=0;i--)
			System.out.println(array[i]);

	}

}
