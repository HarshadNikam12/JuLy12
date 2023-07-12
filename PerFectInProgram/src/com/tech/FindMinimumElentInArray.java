package com.tech;

public class FindMinimumElentInArray 
{
	public static void findMin(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Element is "+min);
	}
	public static void main(String[] args) 
	{
		int [] arr= {1,2,4,2,4,7,8,9,6,4};
		FindMinimumElentInArray.findMin(arr);
		
	}

}
