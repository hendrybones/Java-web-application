package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	int i,j,k;
	int number;
	int row=5;

	for ( i = 0; i <row; i++)
		{
			 number = 1;
			System.out.printf("%" + (row - i) * 2 + "s", "");
			for ( j = 0; j <= i; j++)
			{
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
