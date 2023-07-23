package July;

public class StringDemo 
{
	public static void main(String[] args) {
		String str="Harshad Devidas";
		str=str.replaceAll("\\s", "");
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=1)
			{
				System.out.println((char)i+" reperted "+arr[i]+" times");
			}
		}
	}

}
