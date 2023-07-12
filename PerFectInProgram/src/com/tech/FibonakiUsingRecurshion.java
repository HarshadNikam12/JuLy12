package com.tech;

public class FibonakiUsingRecurshion 
{
	public static int a=0,b=1,c;
	public static void main(String[] args)
	{
		System.out.print(a+" "+b+" ");
		FibonakiUsingRecurshion f=new FibonakiUsingRecurshion();
		f.fibonaki(10);
	}
	void fibonaki(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			fibonaki(i-1);
			
		}
		
	}

}
