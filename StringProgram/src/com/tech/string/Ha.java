package com.tech.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ha 
{
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "harshad");
		map.put(2, "vishal");
		
		
		
		
		
		
		map.forEach((e,y)->System.out.println(e));
		
		map.entrySet().forEach(e->System.out.println(e));
		
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
		
		
		
		
//		Iterator itr=map.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry m1=(Map.Entry)itr.next();
//			System.out.println(m1.getKey());
//		}
		
	}

}
