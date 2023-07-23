package com.tech.jully22;

import java.util.HashSet;

public class RemoveDuplicate 
{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,6,4,3,6};
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			h.add(arr[i]);
		}
		for(int d:h)
		{
			System.out.println(d);
		}
	}

}
