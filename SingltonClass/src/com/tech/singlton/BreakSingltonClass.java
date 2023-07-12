package com.tech.singlton;

import java.lang.reflect.Constructor;

public class BreakSingltonClass 
{
	public static void main(String[] args) throws Exception
	{
		
		
		
		Employee e=Employee.getEmployee();
		System.out.println(e.hashCode());
		
		
		
		Employee er=Employee.getEmployee();
		System.out.println(er.hashCode());
		
		
		
		
	
		}

}
