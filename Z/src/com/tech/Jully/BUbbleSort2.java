package com.tech.Jully;

public class BUbbleSort2 
{
	public static void main(String[] args) {
		 int[] arr={14,433,75,8,8,56,5,34,453,3,45,5,5,5,5,20,30,40,50,60,70,90,80};
		 int temp;
		 for(int pos=0;pos<arr.length;pos++)
		 {
		 for(int i=0;i<arr.length-1;i++)
		 {
			 if(arr[i]<arr[i+1])
			 {
				 temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;
			 }
		 }
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
	}

}
