package com.tech;

import java.util.Arrays;
import java.util.List;

public class Test2 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		double avarge = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avarge);
	}

}
