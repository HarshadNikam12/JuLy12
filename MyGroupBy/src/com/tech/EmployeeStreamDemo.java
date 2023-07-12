package com.tech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamDemo 
{
	static List<Employee> employee=new ArrayList<Employee>();
	public static void main(String args[])
	{
		employee.add(new Employee(1, "Harshad", 25, "Male", "HR", 2011, 25000.0));
		employee.add(new Employee(2, "Sammer", 30, "Male", "BCS", 2018, 23000.0));
		employee.add(new Employee(3, "Praveen", 35, "Male", "MCS", 2012, 25000.0));
		employee.add(new Employee(4, "Akash", 20, "Male", "MANGER", 2024, 27000.0));
		employee.add(new Employee(5, "Sweta", 23, "Female", "CEO", 2022, 28000.0));
		employee.add(new Employee(6, "sampda", 29, "Female", "IT", 2016, 29000.0));
		employee.add(new Employee(7, "tejali", 26, "Female", "BCA", 2000, 21000.0));
		employee.add(new Employee(8, "Rutuja", 32, "Female", "MCA", 2005, 25000.0));
		employee.add(new Employee(9, "Saurav", 39, "Male", "BCOM", 2009, 35000.0));
		employee.add(new Employee(10, "Omkar", 40, "Male", "MCA", 2015, 55000.0));
		employee.add(new Employee(11, "Pratik", 25, "Male", "BCA", 2019, 65000.0));
		employee.add(new Employee(12, "Aniket", 28, "Male", "CEO", 2018, 75000.0));
		employee.add(new Employee(13, "Krushna", 29, "Male", "HR", 2020, 85000.0));
		employee.add(new Employee(14, "Vaibhav", 30, "Male", "IT", 2015, 45000.0));
		employee.add(new Employee(15, "Harshada", 36, "Female", "BCS", 2013, 25000.0));
		employee.add(new Employee(16, "Aniket", 45, "Male", "MCS", 2022, 55000.0));
		employee.add(new Employee(17, "Aadity", 55, "Male", "HR", 2023, 65000.0));
		
		
		
		
		
		
		
	  
		
	
		
		
		
//		List<Integer> collect = employee.stream().map(e->e.getEid()).sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
//		System.out.println(collect);
		
		
		
		
//		
//		List<Employee> collect = employee.stream().limit(5).collect(Collectors.toList());
//		for(Employee e:collect)
//		{
//			System.out.println(e);
//		}
;		 
//		Optional<Double> findFirst2 = employee.stream().map(e->e.getSallary()).sorted(Comparator.reverseOrder()).distinct().findFirst();
//		
//
//		System.out.println(findFirst2);
//		
//		
//		
//		
//		
//		
//		
//		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparing(Employee::getSallary)).distinct().findFirst();
//		System.out.println(findFirst);
		
		
	//	Set<Employee> collect = employee.stream().filter(e->Collections.frequency(employee, e.getAge()>1)).collect(Collectors.toSet());
		
//		List<Integer> collect = employee.stream().map(e->String.valueOf(e.getAge()))
//		                 .filter(e->e.startsWith("2"))
//		                 .map(Integer::valueOf)
//		                 .collect(Collectors.toList());
//		for(Integer list:collect)
//		{
//			System.out.println(list);
//		}
		
		
		
		
//		List<Employee> collect = employee.stream().filter(e->e.getSallary()%2==0).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		
//		for(Employee colEmployee:collect)
//		{
//			System.out.println(colEmployee.getName());
//		}
//		Optional<Double> allsallraryDiscusion = employee.stream().map(e->e.getSallary()).reduce((a,b)->a+b);
//		System.out.println(allsallraryDiscusion);
		
		
		
		
//		Optional<Employee> oldEmployee = employee.stream().max(Comparator.comparingInt(Employee::getAge));
//		System.out.println(oldEmployee);
//		
//		Map<String, List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		Set<Entry<String, List<Employee>>> entrySet = collect.entrySet();
//		
//		for(Entry<String, List<Employee>> entry:entrySet)
//		{
//			System.out.println(entry.getKey());
//			List<Employee> value = entry.getValue();
//			System.out.print(value);
//		}
//		
//		Map<String, Double> sallary = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSallary)));
//		System.out.println(sallary);
		
//		Map<String,Long> collect = employee.stream().filter(e->e.getDepartment()=="BCS")
//		                 .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(collect);
		
		
		
//		Optional<Employee> mostExpiriyans = employee.stream().sorted(Comparator.comparing(Employee::getYearOfJoin)).findFirst();
//		Employee employee2 = mostExpiriyans.get();
//		System.out.println(employee2.getYearOfJoin());
		
//		Optional<Employee> youngstEMployeeinOrgination = employee.stream().filter(e->e.getGender()=="Male" && e.getDepartment()=="HR").min(Comparator.comparingInt(Employee::getAge));
//		System.out.println(youngstEMployeeinOrgination);
//		
		
//		Map<String, Double> avargeSallryDepartment = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = avargeSallryDepartment.entrySet();
//		for(Entry<String,Double> entry:entrySet)
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		
//		Map<String, Long> numberOfYeployee = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = numberOfYeployee.entrySet();
//		for(Entry<String,Long> entry:entrySet)
//		{
//			System.out.println(entry.getValue()+" "+entry.getKey());
//		}
		
		//employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getYearOfJoin).forEach(System.out::println);		
		
//		Optional<Employee> getSallary = employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//		System.out.println(getSallary.get());
		
		
//		Map<String, Double> avaregeAge = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		System.out.println(avaregeAge);
		//employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
		
		
		//how many male And female employee in an Orginazaltion
		//Map<String, Long> numberOfMaleAndFemaleEmployee = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		//System.out.println(numberOfMaleAndFemaleEmployee);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getYearOfJoin).forEach(System.out::println);
		
		
		
		
		
		
//		Optional<Employee> getMaxSallary = employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//		System.out.println(getMaxSallary.get().getName());
		
		
		
		
		
		
//		Map<String, Double> avargeAgeMaleAndFeamle = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		System.out.println(avargeAgeMaleAndFeamle);
		
		
		
		
//		Map<String, Long> departMent = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(departMent.ge);
		
		
		
		//employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
		
		
		
		
//		Map<String, Long> numberOfMaleAndFemale = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(numberOfMaleAndFemale);
		
		
		
		
//		
//		Map<String, Long> NUmberOFMaleAndFemaleEMployee = employee.stream()
//				                                          .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//	                                                      System.out.println(NUmberOFMaleAndFemaleEMployee);
//		
//		System.out.println("==============================");
//		
//		                                                  employee.stream()
//		                                                  .map(Employee::getDepartment)
//		                                                  .distinct()
//		                                                  .forEach(System.out::println);
//		
//		System.out.println("==================================");
//		
//		Map<String, Double> AvvargeAgeOfAllEmployy =      employee.stream()                                
//				.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		System.out.println(AvvargeAgeOfAllEmployy);
//		
//		System.out.println("==============================");
//		
//		Optional<Employee> getHihestSallary = employee.stream()
//				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//		System.out.println(getHihestSallary.get().getName());
//		
//		System.out.println("======");
//		
//	    employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getName).forEach(System.out::println);
//	    
//	    System.out.println("============");
//	    
//	    Map<String, Long> employyeCounrByDepartment = employee.stream()
//	    		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//	    System.out.println(employyeCounrByDepartment);
//	    
//	    System.out.println("=================");
//	    
//	    Map<String, Double> getDepartMentWiseSallayAvvarge = employee.stream()
//	    		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//	    System.out.println(getDepartMentWiseSallayAvvarge);
//	    
//	    System.out.println("=========================");
//	    
//	    Optional<Employee> getYongestEmployeeinITDepartment = employee.stream()
//	    		.filter(e->e.getGender()=="Male" && e.getDepartment()=="IT").min(Comparator.comparingInt(Employee::getAge));
//	    System.out.println(getYongestEmployeeinITDepartment);
//	    
//	    System.out.println("==============================");
//	    Optional<Employee> seniorEmployeeinOrginazation = employee.stream()
//	    		.sorted(Comparator.comparingInt(Employee::getYearOfJoin))
//	    		.findFirst();
//	    System.out.println(seniorEmployeeinOrginazation.get());
//	    
//	    System.out.println("=================================");
//	    
//	    Map<String, Long> getAge = employee.stream().filter(e->e.getDepartment()=="BCA And BCS")
//	    		.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//	    System.out.println(getAge);
//	    
//	    System.out.println("===============");
//	    
//	    
//	    Map<String, Double> getAvrageAgeofMAleAndFemale = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//	    System.out.println(getAvrageAgeofMAleAndFemale);
//	    
//	    System.out.println("=================");
//	    
//	    Map<String, List<Employee>> getAllEmployeeByDepartMent = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//	    Set<Entry<String,List<Employee>>> entrySet = getAllEmployeeByDepartMent.entrySet();
//	    for(Entry<String, List<Employee>> entry:entrySet)
//	    {
//	    	System.out.println("--------");
//	    	System.out.println(entry.getKey());
//	    	
//	    	List<Employee> value = entry.getValue();
//	    	for(Employee get:value)
//	    	{
//	    		System.out.println(get.getName());
//	    		
//	    	}
//	    }
//	    System.out.println("==========================");
//	    
//	    DoubleSummaryStatistics doubleSummaryStatistics = employee.stream().collect(Collectors.summarizingDouble(Employee::getSallary));
//	    System.out.println("Avarage Sallaey "+doubleSummaryStatistics.getAverage());
//	    System.out.println("get Tottle of all Sallary "+doubleSummaryStatistics.getSum());
//	    
//	    
//	    System.out.println("==================================================");
//	    
//	    Map<Boolean, List<Employee>> collect = employee.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
//	    Set<Entry<Boolean,List<Employee>>> entrySet2 = collect.entrySet();
//	    for(Entry<Boolean, List<Employee>>  get2:entrySet2)
//	    {
//	    	System.out.println("---------");
//	    	if(get2.getKey())
//	    	{
//	    		System.out.println("Employee OlderThan 25");
//	    	}
//	    	else
//	    	{
//	    		System.out.println("Employee Greter Than 25");
//	    	}
//	    	System.out.println("-----------------------");
//	    	List<Employee> list = get2.getValue();
//	    	for(Employee g:list)
//	    	{
//	    		System.out.println(g.getName());
//	    	}
//	    	
//	    }
//	    System.out.println("===========================");
//	    Optional<Employee> getMAxiMumAge = employee.stream().max(Comparator.comparingInt(Employee::getAge));
//	    Employee employee2 = getMAxiMumAge.get();
//	    System.out.println(employee2.getName());
//	    System.out.println(employee2.getDepartment());
//	    
//	    System.out.println("================================");
//	    
//	    
//	    
//	    
//	    Optional<Double> getThirdHihestEMployee = employee.stream().map(e->e.getSallary()).sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();
//	    System.out.println(getThirdHihestEMployee.get());
//	    System.out.println(getThirdHihestEMployee);
//	    
//	    System.out.println("===========================");
//	    
//	    
//	    employee.stream().map(e->e.getSallary()).sorted(Comparator.reverseOrder()).distinct().limit(3).forEach(e->System.out.println(e));
//	    
//	    System.out.println("================================");
//	    Optional<Double> findFirst = employee.stream().map(e->e.getSallary()).sorted(Comparator.reverseOrder()).distinct().limit(3).skip(2).findFirst();
//	    System.out.println(findFirst.get());
	    
	}
	
	

}
