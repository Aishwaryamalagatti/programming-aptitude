package com.xworkz.designpatterns;

public class StarP {

	public static void main(String[] args) {
		System.out.println("Print StarP");
		int num = 6;
		int mid=num/2;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i==j || i+j==6 || i==mid || j==mid)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
