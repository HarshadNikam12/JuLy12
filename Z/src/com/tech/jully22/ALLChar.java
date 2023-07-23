package com.tech.jully22;

public class ALLChar 
{
	public static void main(String[] args) {
		String str="Harshad devidas nikam";
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=1)
			{
				System.out.println(i+"Charecter is avalable in "+arr[i]+" time");
			}
		}
	}

}
