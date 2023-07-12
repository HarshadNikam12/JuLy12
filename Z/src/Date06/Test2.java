package Date06;

import java.util.Set;

class A
{
	public A()
	{
		System.out.println("hii i am A class Constructor");
	}
	int x=10;
	public void m1()
	{
	   System.out.println("class A m1 Method");	
	}
	public void m2()
	{
		System.out.println("Class A m2 Method");
	}
}
class B extends A
{
	int x=5;
	int y=10;
	public void m1()
	{
		System.out.println("Class B m1 Method");
	}
	public void m3()
	{
		System.out.println("Class B m3 Mehtod");
	}
}
class C extends B
{
	int y=15;
	int z=30;
	public void m3()
	{
		System.out.println("Class C m3 Mehtod ");
	}
	public void m4()
	{
		System.out.println("Class C m4 Method ");
	}
}
public class Test2 
{
	public static void main(String[] args) 
	{
		
//   	C c=new A();
		
		
		
		
		
//		B b=new C();
//		System.out.println(b.x);
//		System.out.println(b.y);
//		b.m1();
//		b.m2();
//		b.m3();
		
		
//		A a=new C();
//		System.out.println(a.x);
//		a.m1();
//		a.m2();
		
		
		
//		A a=new A();
//		System.out.println(a.x);
//		a.m1();
//		a.m2();
		
		
		
		
		
		
    
//		B b=new B();
//		System.out.println(b.x);
//		System.out.println(b.y);
//		b.m1();
//		b.m2();
//		b.m3();
		
		
		
		
		
		
		
//      C c=new B();
 
		
		
//		C c=new C();
//		System.out.println(c.x);
//		System.out.println(c.y);
//		System.out.println(c.z);
//		c.m1();
//		c.m2();
//		c.m3();
//		c.m4();
		
	}

}
