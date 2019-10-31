//printing the index value in different ways 
package com.array;

public class Demo4 {

	public static void main(String[] args) {
		int [] x= {10,20,30};
			System.out.println(x);
			System.out.println(x.length);
			System.out.println(x[0]);
			int b=2;
			System.out.println(x[b]);
			System.out.println(x[b-1]);//2-1=1, so 1 is 20
			System.out.println(x[10]);//exception IndexOutOfBound
			System.out.println(x[-1]);
			System.out.println(x[x.length]);
			System.out.println("end of main");
	}

}
