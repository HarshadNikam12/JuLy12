package com.tech;

import java.util.Arrays;
import java.util.List;

public class Test3 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,7,8,8);
		list.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		System.out.println("===========================================");
		list.stream().filter(e->e%2!=0).forEach(e->System.out.println(e));
	}

}
