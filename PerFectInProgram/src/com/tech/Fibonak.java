package com.tech;

public class Fibonak 
{
	public static void main(String[] args) {
		int a=0;int b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<=10;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
	}

}
