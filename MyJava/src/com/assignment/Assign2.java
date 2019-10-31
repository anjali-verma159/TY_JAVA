//wap to swap two number without using temporary variable 
package com.assignment;

public class Assign2 {

	public static void main(String[] args) {
		int x=12;
		int y=50;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping:"+"x="+ x+" y="+y);

	}

}
