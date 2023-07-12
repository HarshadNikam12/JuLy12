package com.FindDuplicateElemnt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ByUsingHashtable 
{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5,6,7,8,8,2,2,3,3};
		Map<Integer, Integer> hm=new HashMap<>();
		for(int no:a)
		{
			Integer count=hm.get(no);
			if(count==null)
			{
				hm.put(no, 1);
			}
			
			else
			{
				count=count+1;
				hm.put(no, count);
			}
		}
		Set<Map.Entry<Integer, Integer>> es=hm.entrySet();
		for(Map.Entry<Integer, Integer> no:es)
		{
			if(no.getValue()>1)
			{
				System.out.println(no.getKey());
			}
		}
	}

}
