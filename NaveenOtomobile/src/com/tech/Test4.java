package com.tech;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> NumberStartWith2 = list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2"))
		.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(NumberStartWith2);
	}

}
