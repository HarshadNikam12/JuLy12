package com.tech;


class A
{
public A()
{
System.out.println("Class A");
}
public void  show()
{
System.out.println("Class A show");
}
}
class B extends A
{
   public void b()
   {
     System.out.println("Class B");
   }

   public void show()
   {
      System.out.println("Class B show");
   }
    public void  Print()
    {
       System.out.println("Class B print");
    }
}

public class Abc
{
public static void main(String[] args) 
{
	
	A a=new B();
	a.show();
	
	
//	B b=new B();
//	b.b();
//	
//	b.show();
//	b.Print();
	
	
	
//B b= new A();
//b.show();//class B show
//b.print();//class B Print
}
}
