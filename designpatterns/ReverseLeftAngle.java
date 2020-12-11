package com.xworkz.designpatterns;

public class ReverseLeftAngle {

	public static void main(String[] args) {
		System.out.println("print ReverseLeftAngle");
		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
	