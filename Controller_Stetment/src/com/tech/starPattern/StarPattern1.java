package com.tech.starPattern;

import java.util.HashMap;

public class StarPattern1 
{
	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Harshad");
		hm.put(2, "vishal");
		System.out.println(hm.size());
		hm.put(2, "vishal");
		System.out.println(hm.size());
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		HashMap<Integer, Employee> hmm=new HashMap<>();
		hmm.put(1, e1);
		hmm.put(2, e2);
		System.out.println(hmm.size());
		hmm.put(1, e1);
		System.out.println(hmm.size());
		hmm.put(3, e2);
		System.out.println(hmm.size());
		
		
		
//		
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
	}

}
