package com.tech.jully22;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate 
{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,6,7,8,9,5,6,0};
		Set<Integer> set=new HashSet<Integer>();
		for(int s:arr)
		{
			if(set.add(s)==false)
			{
				System.out.println(s);
			}
		}
	}

}
