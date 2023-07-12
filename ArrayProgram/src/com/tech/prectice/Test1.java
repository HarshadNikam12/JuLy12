package com.tech.prectice;

import java.util.HashSet;

public class Test1 
{
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,4,4,4,2,1,9,4,6,8,0};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		for(int res:hs)
		{
			System.out.print(res+" ");
		}
	}

}
