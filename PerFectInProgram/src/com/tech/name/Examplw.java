package com.tech.name;

import java.lang.reflect.Constructor;

public class Examplw 
{
	public static void main(String[] args) throws Exception, Exception {
		Test t=Test.getTest();
		System.out.println(t.getTest());
		
		Test tt=Test.getTest();
		System.out.println(tt.getTest());
		
		
		Constructor<Test> constructor=Test.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Test newInstance = constructor.newInstance();
		System.out.println(newInstance);
		
		
	}

}
