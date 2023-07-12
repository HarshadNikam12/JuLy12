package com.tech.prectice;

public class Test2 
{
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,4,4,4,2,1,9,4,6,8,0};
		int[] temp=new int[arr.length];
		
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}

}
