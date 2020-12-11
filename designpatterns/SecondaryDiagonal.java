package com.xworkz.designpatterns;

public class SecondaryDiagonal {

	public static void main(String[] args) {

		System.out.println("Print secondary diagonal");

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i + j == 4) {
					System.out.println("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
