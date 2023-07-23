package com.Duplicate;



class A
{
	public synchronized void d1(B b)
	{ 
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		System.out.println("Thread 1 tring to print");
		b.last();
		
		
		
	}
	public synchronized void last()
	{
		System.out.println("inside A this is Last()");
	}
}

class B
{
	public synchronized void d2(A a)
	{ 
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		System.out.println("Thread 1 tring to print");
		a.last();
		
		
	}
	public synchronized void last()
	{
		System.out.println("inside A this is Last()");
	}
}

public class SyncronizedD extends Thread
{
	
	A a=new A();
	B b=new B();
	public void m1()
	{
		this.start();
		a.d1(b);
	}
	public void run()
	{
		b.d2(a);
	}
	public static void main(String[] args)
	{
		SyncronizedD d=new SyncronizedD();
		d.m1();
		//d.start();
		
		
		
	}

}
