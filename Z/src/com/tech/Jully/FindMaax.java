package com.tech.Jully;

public class FindMaax 
{
	public static void main(String[] args) {
		 int[] arr={10,20,30,40,50,60,70,90,80};
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(max<arr[i])
			 {
				 max=arr[i];
			 }
		 }
		 System.out.println("Maximimum Element is "+max);
	}

}
