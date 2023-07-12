package com.tech;

public class PrimeNUmber1_to_100 
{
	public static void main(String[] args) {
		
	int temp=0;
	int count=0;
	for(int i=0;i<=100;i++)
	{
		for(int j=2;j<i-1;j++)
		{
			if(i%j==0)
			{
				temp=temp+1;
			}
			
		}
		if(temp==0)
		{
			count++;
			System.out.println(i+" "+count);
		}
		else
		{
			temp=0;
		}
		
		
	}
	}

}
