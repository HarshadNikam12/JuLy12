package com.tech;

public class PrimeNumber 
{
	public static void main(String[] args) {
		int no=6;
		int temp=0;
		for(int i=2;i<no-1;i++)
		{
			if(no%2==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("NOt a Prime Number ");
		}
		else
		{
			System.out.println("it iS prime nUmber ");
		}
	}

}
