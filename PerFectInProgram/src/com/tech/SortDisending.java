package com.tech;

public class SortDisending 
{

	public static void sortAlogo(int a[])
	{
		int temp;
		for(int pass=0;pass<a.length;pass++)
		{
		for(int i=0;i<a.length-1-pass;i++)
		{
			if(a[i]<a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args)
	{
		int [] arr= {1,2,4,2,4,7,8,9,6,4};
		SortDisending.sortAlogo(arr);
	}
	

}
