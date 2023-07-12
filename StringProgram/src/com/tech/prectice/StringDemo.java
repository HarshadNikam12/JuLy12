package com.tech.prectice;

public class StringDemo 
{
	public static void main(String[] args) {
		String str="1234567890";
		int[] count=new int[10];
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(i))
			{
				int num=Character.getNumericValue(c);
				
				count[num]++;
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" repested "+count[i]+" time");
		}
		
	}

}
//public static void main(String[] args) {

