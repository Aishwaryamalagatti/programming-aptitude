package com.xworkz.designpatterns;

public class RightAngle {

	public static void main(String[] args) {
		System.out.println("print LeftAngle");

		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j <= i && i + j <= num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}

}
