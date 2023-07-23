package com.Duplicate;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateByUsingHashset 
{
	public static void main(String[] args) {
	int[] a= {2,3,4,4,3,2,4,6,4,2};
	
	HashSet<Integer> b=new HashSet<>();
	for(int i=0;i<a.length;i++)
	{
		b.add(a[i]);
	}
	for(int g:b)
	{
		System.out.println(g);
	}
	
	
//	HashSet<Integer> h=new HashSet<>();
//	for(int i=0;i<a.length;i++)
//	{
//		h.add(a[i]);
//	}
//	for(int gf:h)
//	{
//		System.out.println(gf);
//	}
	
	
//	HashSet<Integer> hs=new HashSet<>();
//	for(int i=0;i<a.length;i++)
//	{
//		hs.add(a[i]);
//	}
//	for(int ab:hs)
//	{
//		System.out.println(ab);
//	}
	
	
//	HashSet<Integer> hs=new HashSet<>();
//	for(int i=0;i<a.length;i++)
//	{
//		hs.add(a[i]);
//	}
//	for(int b:hs)
//	{
//		System.out.println(b);
//	}
//	HashSet<Integer> hs=new HashSet<>();
//	for(int i=0;i<a.length;i++)
//	{
//		hs.add(a[i]);
//	}
//	for(Integer res:hs)
//	{
//	System.out.println(res);
//	}
	}
	
	

}
