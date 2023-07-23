package July.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDeno
{
	public static void main(String[] args) 
	{
		List<String> winterFruits = new ArrayList();
		winterFruits.add("Clementine");
		winterFruits.add("Plums");
		winterFruits.add("Dates");
		winterFruits.add("Grapefruit");
		winterFruits.add("Kiwi");
		
		List summerFruits = new ArrayList();
		summerFruits.add("Mango");
		summerFruits.add("Plums");
		summerFruits.add("Watermelon");
		summerFruits.add("Papaya");
		summerFruits.add("Grapefruit");
		
		
		
		
		List duplicateList = new ArrayList();
		
		
		
		for (String fruitName : winterFruits)
		{
		 if (summerFruits.contains(fruitName)) 
		 {	 
		  duplicateList.add(fruitName);
		  
		 }
		}
		System.out.println(duplicateList);
		
		
		
	}

}
