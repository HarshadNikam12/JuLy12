package com.tech;

class P
{
	public void p1()
	{
		System.out.println("Class P1 method pOne");
	}
    public void p2()
    {
    	System.out.println("Class P1 Method pTwo");
    }
}
class C extends P
{
	
  public void p1()
	{
		System.out.println("Class C method c1");
	}
	void c2()
	{
		System.out.println("Class C method c2");
	}
}
class D extends C
{
	public void d1()
	{
		System.out.println("Class D Method d1");
	}
	public void d2()
	{
		System.out.println("class D mehod d2");
	}
}
public class Test1 
{
	public static void main(String[] args) 
	{
		
		P p2=new D();
		p2.p1();
		p2.p2();
	
		
		
//		
//		P p1=new D();
//		p1.p1();
//		p1.p2();
//		Class P1 method pOne
//		Class P1 Method pTwo
		
		
		
//		C c1=new D();
//		c1.c1();
//		c1.c2();
//		c1.p1();
//		c1.p2();
//		Class C method c1
//		Class C method c2
//		Class P1 method pOne
//		Class P1 Method pTwo
		
		
		
		
//		P p=new P();
//		p.p1();
//		p.p2();
//		Class P1 method pOne
//		Class P1 Method pTwo
		
//		
//		C c=new C();
//		c.p1();
//		c.p2();
//		c.c1();
//		c.c2();
//		Class P1 method pOne
//		Class P1 Method pTwo
//		Class C method c1
//		Class C method c2
		
		
//		D d=new D();
//		
//		d.p1();
//		d.p2();
//		
//		d.c1();
//		d.c2();
//		
//		d.d1();
//		d.d2();
//		
//		Class P1 method pOne
//		Class P1 Method pTwo
//		Class C method c1
//		Class C method c2
//		Class D Method d1
//		class D mehod d2
		
	}

}
