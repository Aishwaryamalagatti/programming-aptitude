package com.xworkz.designpatterns;

public class LeftAngle {

	public static void main(String[] args) {
		System.out.println("print LeftAngle");

		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i+j>=num && j>=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}
