package com.Xworkz.NoOfWords;

public class CountWords {

	public static void main(String[] args) {
		String str = "Xworkz is located in Bangalore Rajaji Nagar 4th Stage"; 
		
		int count = 1;
		
		for(int i=0; i<str.length() - 1; i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		System.out.println("Number of words in a string is :" +count);
	}

}
