package com.Xworkz.MinArray;

public class MinArray {

	public static void main(String[] args) {
		int[] intArray= {90,23,45,76,100,33,22,77};
		int minNum=intArray[0];
		
		for(int j:intArray) {
			if(j<minNum)
				minNum=j;
		}
		System.out.println("Minimum number in the given array is :"+minNum);
	}

	}

