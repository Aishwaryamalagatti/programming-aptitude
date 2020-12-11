package com.xworkz.designpatterns;

public class PrimaryDiagonal {

	public static void main(String[] args) {
		System.out.println("Print diagonal");
				
				for(int i=0;i<=4;i++) {
					for(int j=0;j<=4;j++) {
						if(i==j)
						{
							System.out.println("*");
						}
						else {
							System.out.print(" ");
						}		
					}
					System.out.println();
					}
			}
}
