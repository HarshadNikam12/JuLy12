package com.tech;

class Demo_base 
{
	   int value = 1000;
	   Demo_base()
	   {
	      System.out.println("This is the base class constructor");
	   }
	}
	class Demo_inherits extends Demo_base {
	   int value = 10;
	   Demo_inherits()
	   {
	      System.out.println("This is the inherited class constructor");
	   }
	}
	public class PernetClass {
	   public static void main(String[] args) {
	      Demo_inherits my_inherited_obj = new Demo_inherits();
	      System.out.println("In the main class, inherited class object has been created");
	      System.out.println("Reference of inherited class type :" + my_inherited_obj.value);
	      Demo_base my_obj = my_inherited_obj;
	      System.out.println("In the main class, parent class object has been created");
	      System.out.println("Reference of base class type : " + my_obj.value);
	   }
	}