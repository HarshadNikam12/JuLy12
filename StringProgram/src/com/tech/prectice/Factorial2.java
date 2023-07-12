package com.tech.prectice;

public class Factorial2 
{
	public static int fact=1;
	public static void main(String[] args) {
		int no=5;
		int res;
		Factorial2 n=new Factorial2();
	    res=n.calFact(no);
	    System.out.println(res);
	}
	int calFact(int a)
	{
		if(a>=1)
		{
			fact=fact*a;
			calFact(a-1);
		}
		return fact;
	}

}
