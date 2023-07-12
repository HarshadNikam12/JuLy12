package com.tech;

public class FactorialUsingRecrshion 
{
	public static int fact=1;
	public static void main(String[] args) {
		int no=5,res;
		FactorialUsingRecrshion f=new FactorialUsingRecrshion();
	    res=f.calFact(no);
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
