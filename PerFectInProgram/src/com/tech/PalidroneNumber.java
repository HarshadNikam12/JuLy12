package com.tech;

public class PalidroneNumber 
{
	public static void main(String[] args) {
		int no=121;
		int temp=no;
		int rem;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		if(no==rev)
		{
			System.out.println("Number is Palidrone");
		}
		else
		{
			System.out.println("Number is Not Palidrone");
		}
	}

}
