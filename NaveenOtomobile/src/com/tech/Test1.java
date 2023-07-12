package com.tech;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test1 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Optional<Integer> Addishion = list.stream().reduce((a,b)->a+b);
		System.out.println(Addishion.get());
	}

}
