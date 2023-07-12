package com.tech.string.parfect;

public class MaximumOccuringChar 
{
	public static void main(String[] args) {
		String str="abb";
		str=str.replaceAll("\\s", "");
		int arr[]=new int[126];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max=-1;
		char c=' ';
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(i)]>max)
			{
			max=arr[str.charAt(i)];
			c=str.charAt(i);
			}
					
		}
		System.out.println("maximimu Occuring Charecr "+c+" "+max);
	}

}
