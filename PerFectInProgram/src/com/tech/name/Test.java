package com.tech.name;

public class Test 
{
	private static Test test;
	private Test()
	{
		
	}
	public static Test getTest()
	{
		if(test==null)
		{
			synchronized(Test.class)
			{
				if(test==null)
				{
					test=new Test();
				}
			}
			
		}
		return test;
	}

}
