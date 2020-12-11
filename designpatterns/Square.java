package com.xworkz.designpatterns;

public class Square {

	public static void main(String[] args) {

		System.out.println("Print all stars");

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
