package com.tech.Jully;

public class StringSort 
{
	public static void main(String[] args) {
		String str[]= {"asd","sas","dfr","gdgt","teg"};
		String temp;
		for(int pos=0;pos<str.length;pos++)
		{
		for(int i=0;i<str.length-1;i++)
		{
			if(str[i].compareTo(str[i+1])>0)
			{
				temp=str[i];
				str[i]=str[i+1];
				str[i+1]=temp;
			}
		}
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}

}
