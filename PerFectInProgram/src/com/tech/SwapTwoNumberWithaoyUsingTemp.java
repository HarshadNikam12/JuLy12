package com.tech;

public class SwapTwoNumberWithaoyUsingTemp 
{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a number is "+a);
		System.out.println("b nnumber is "+b);
	}

}
