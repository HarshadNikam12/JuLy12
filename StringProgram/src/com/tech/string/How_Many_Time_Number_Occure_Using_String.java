package com.tech.string;

public class How_Many_Time_Number_Occure_Using_String 
{
	public static void main(String[] args) {
	String str="11235809876543";
	int[] count=new int[10];//9970989979
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if(Character.isDigit(i));
		{
			int num=Character.getNumericValue(c);
			
			count[num]++;
		}
	}
	for(int i=0;i<10;i++)
	{
		System.out.println("number "+i+" occore "+count[i]+" ");
	}
	}

}
