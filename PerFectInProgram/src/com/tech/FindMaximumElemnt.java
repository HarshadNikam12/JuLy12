package com.tech;

public class FindMaximumElemnt
{
	public static void findMax(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Elemnt is "+max);
	}
	public static void main(String[] args) 
	{
		int [] arr= {1,2,4,2,4,7,8,9,6,4};
		FindMaximumElemnt.findMax(arr);
	}

}
