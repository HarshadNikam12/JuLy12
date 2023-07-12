package com.tech.string.parfect;

public class MinimumOccuringChar
{
	public static void main(String[] args) {
		String str="bbccc";
		str=str.replaceAll("\\s", "");
		int arr[]=new int[126]; 
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int min=str.length()-1;
		char c=' ';
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(min)]<min)
			{
				min=arr[str.charAt(i)];
				c=str.charAt(i);
				
			}
		}
		System.out.println("Minimu Occuring Charecter is "+c+" "+min);
	}

}
