package com.Xworkz.MaxArray;

public class MaxArray {

	public static void main(String[] args) {
		int[] intArray= {90,23,45,76,100,33,22,77};
		int maxNum=intArray[0];
		
		for(int j:intArray) {
			if(j>maxNum)
				maxNum=j;
		}
		System.out.println("Maximum number in the given array is :"+maxNum);
	}

}
