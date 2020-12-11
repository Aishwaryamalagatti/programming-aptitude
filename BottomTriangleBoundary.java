package com.xworkz.designpatterns;

public class BottomTriangleBoundary {

	public static void main(String[] args) {
		System.out.println("Print BottomTriangleBoundary");
		int num = 4;
		int mid=num/2;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i==mid || i-j==mid || i+j==num+mid)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
