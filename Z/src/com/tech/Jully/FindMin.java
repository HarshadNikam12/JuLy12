package com.tech.Jully;

public class FindMin 
{
	public static void main(String[] args) {
		 int[] arr={10,20,30,40,50,60,70,90,80};
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(min>arr[i])
			 {
				 min=arr[i];
			 }
		 }
		 System.out.println("minimum Element is "+min);
	}

}
