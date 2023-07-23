package com.tech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
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
		employee.add(new Employee(9, "Saurav", 39, "Male", "BCOM", 2009, 15000.0));
		employee.add(new Employee(10, "Omkar", 40, "Male", "MCA", 2015, 55000.0));
		employee.add(new Employee(11, "Pratik", 25, "Male", "BCA", 2019, 65000.0));
		employee.add(new Employee(12, "Aniket", 28, "Male", "CEO", 2018, 90000.0));
		employee.add(new Employee(13, "Krushna", 29, "Male", "HR", 2020, 85000.0));
		employee.add(new Employee(14, "Vaibhav", 30, "Male", "IT", 2015, 45000.0));
		employee.add(new Employee(15, "Harshada", 15, "Female", "BCS", 2013, 25000.0));
		employee.add(new Employee(16, "Aniket", 45, "Male", "MCS", 2022, 55000.0));
		employee.add(new Employee(17, "Aadity", 55, "Male", "HR", 2023, 65000.0));
		
		
		Stream<Employee> stream = employee.stream();
		
		
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoin)).findFirst();
//		System.out.println(findFirst.get());
		
//		Optional<Employee> findFirst = employee.stream().filter(e->e.getDepartment()=="HR" && e.getGender()=="Male").sorted(Comparator.comparingInt(Employee::getAge)).findFirst();
//		System.out.println(findFirst.get().getName());
		//System.out.println(findFirst.get().getAge());
	
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double>e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getName).forEach(System.out::println);
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary)).findFirst();
//		System.out.println(findFirst.get());
		
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).findFirst();
//		System.out.println(findFirst.get());
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> d:entrySet)
//		{
//			System.out.println(d);
//		}
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary)).findFirst();
//		System.out.println(findFirst);
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).findFirst();
//		Employee employee2 = findFirst.get();
//		System.out.println(employee2);
		
		
		
//		
//		Map<Boolean,List<Employee>> collect = employee.stream().collect(Collectors.partitioningBy(e->e.getAge()>24));
//		Set<Entry<Boolean,List<Employee>>> entrySet = collect.entrySet();
//		
//	    System.out.println(entrySet);
		
		
		
		
		
//		DoubleSummaryStatistics collect = employee.stream().collect(Collectors.summarizingDouble(Employee::getSallary));
//		System.out.println(collect.getSum());
//		System.out.println(collect.getAverage());
//		System.out.println(collect.getCount());
		
		
		
//		Map<String,List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<String, List<Employee>> e:entrySet)
//		{
//			System.out.println(e.getKey());
//			List<Employee> value = e.getValue();
//			for(Employee ee:value)
//			{
//				System.out.println(ee.getName());
//			}
//		}
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		Map<String,Long> collect = employee.stream().filter(e->e.getDepartment()=="HR").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoin).reversed()).findFirst();
//		Employee employee2 = findFirst.get();
//		System.out.println(employee2);
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getAge)).findFirst();
//		Employee employee2 = findFirst.get();
//		System.out.println(employee2);
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double>e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
		//employee.stream().filter(e->e.getYearOfJoin()>2020).map(Employee::getName).forEach(System.out::println);
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).findFirst();
//		Employee employee2 = findFirst.get();
//		
//		System.out.println(employee2);
//		
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary)).findFirst();
//		Employee employee2 = findFirst.get();
//		System.out.println(employee2);
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
		
		
		
		//employee.stream().map(Employee::getDepartment).distinct().forEach(e->System.out.println(e));
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> e:entrySet)
//		{
//			String key = e.getKey();
//			System.out.println(key);
//			Long value = e.getValue();
//			System.out.println(value);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<String,Optional<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSallary)))));
//        Set<Entry<String,Optional<Employee>>> entrySet = collect.entrySet();
//        for(Entry<String,Optional<Employee>> e:entrySet)
//        {
//        	System.out.println(e.getKey());
//        	Optional<Employee> value = e.getValue();
//        	System.out.println(value.get().getName()+" "+value.get().getSallary());
//        }
		
//		employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::get)))
		
//		List<Employee> limit = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).limit(3).collect(Collectors.toList());
//        		for(Employee e:limit)
//        		{
//        			System.out.println(e.getSallary()+" "+e.getName());
//        		}
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).distinct().skip(1).findFirst();
//		System.out.println(findFirst.get().getSallary());
//		System.out.println(findFirst.get().getName());
		
		
//		employee.stream().filter(e->e.getGender()=="Male" && e.getAge()>25).map(Employee::getName).forEach(System.out::println);
//		
//		Optional<Employee> max = employee.stream().max(Comparator.comparingInt(Employee::getAge));
//		Employee employee2 = max.get();
//		System.out.println(employee2.getName());
//		System.out.println(employee2.getAge());
		
//		Map<Boolean,List<Employee>> collect = employee.stream().collect(Collectors.partitioningBy(e->e.getAge()>20));
//		Set<Entry<Boolean,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<Boolean,List<Employee>> e:entrySet)
//		{
//			Boolean key = e.getKey();
//			System.out.println(key);
//			List<Employee> value = e.getValue();
//			for(Employee r:value)
//			{
//				System.out.println(r);
//			}
//			
//		}
		
//		DoubleSummaryStatistics collect = employee.stream().collect(Collectors.summarizingDouble(Employee::getSallary));
//		
//		System.out.println(collect.getMax());
//		System.out.println(collect.getMin());
//		System.out.println(collect.getSum());
//		System.out.println(collect.getAverage())000000;
		
//		Map<String,List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<String, List<Employee>>e:entrySet)
//		{
//			System.out.println("==========");
//			System.out.println(e.getKey());
//			List<Employee> value = e.getValue();
//			for(Employee eq:value)
//			{
//				System.out.println(eq);
//			}
//		}
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
		
//		Map<String,Long> collect = employee.stream().filter(e->e.getDepartment()=="CEO").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoin)).findFirst();
//		System.out.println(findFirst.get().getName());
//		System.out.println(findFirst.get().getYearOfJoin());
		
//		Optional<Employee> max = employee.stream().filter(e->e.getDepartment()=="HR").min(Comparator.comparingInt(Employee::getAge));
//		System.out.println(max.get().getName());
//		System.out.println(max.get().getAge());
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getName).forEach(System.out::println);
//		
//		Optional<Employee> collect = employee.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSallary)));
//		Employee employee2 = collect.get();
//		System.out.println(employee2);
		
//		Optional<Employee> collect = employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//		Employee employee2 = collect.get();
//		System.out.println(employee2);
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
//		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> e:entrySet)
//		{
//			System.out.println(e);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//	    List<Employee> collect = employee.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(),
//	    		Collections::unmodifiableList));
//	    
//        
//		System.out.println(collect);
//		
		
//		String collect = employee.stream().map(Employee::getName).collect(Collectors.joining(","));
//		System.out.println(collect);
		
//		 Map<String,Integer> collect = employee.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge,(a1, a2) -> a1));
//		 Set<Entry<String,Integer>> entrySet = collect.entrySet();
//		 for(Entry<String, Integer>e:entrySet)
//		 {
//			 System.out.println(e.getKey()+" "+e.getValue());
//			 
//		 }
		 
	   
		
		
//		List<Employee> collect = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).limit(3).collect(Collectors.toList());
//		for(Employee e:collect)
//		{
//			System.out.println(e);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<String,Optional<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSallary)))));
//        Set<Entry<String,Optional<Employee>>> entrySet = collect.entrySet();
//        for(Entry<String,Optional<Employee>> e:entrySet)
//        {
//        	String key = e.getKey();
//        	System.out.println(key);
//        	System.out.println(e.getValue());
//        }
		
		//List<Employee> collect = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).limit(3).collect(Collectors.toList());
//	    for(Employee e:collect)
//	    {
//	    	System.out.println(e.getSallary());
//	    }
		
		
//		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getSallary).reversed()).distinct().skip(6).findFirst();
//		System.out.println(findFirst.get().getName());
//		System.out.println(findFirst.get().getSallary());
		
//		Optional<Employee> max = employee.stream().max(Comparator.comparingInt(Employee::getAge));
//		System.out.println(max.get().getName());
//		System.out.println(max.get().getAge());
		
//		Map<Boolean,List<Employee>> collect = employee.stream().collect(Collectors.partitioningBy(e->e.getYearOfJoin()>2015));
//		Set<Entry<Boolean,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<Boolean,List<Employee>> entry:entrySet)
//		{
//			List<Employee> value = entry.getValue();
//			for(Employee e:value)
//			{
//				System.out.println(e.getName());
//			}
//		}
		
//		DoubleSummaryStatistics collect = employee.stream().collect(Collectors.summarizingDouble(Employee::getSallary));
//		System.out.println(collect.getSum());
//		System.out.println(collect.getAverage());
//		System.out.println(collect.getCount());
//		System.out.println(collect.getMax());
//		System.out.println(collect.getMin());
		
		
//		Map<String,List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<String,List<Employee>> e:entrySet)
//		{
//			System.out.println("-----------");
//			String key = e.getKey();
//			System.out.println(key);
//			List<Employee> value = e.getValue();
//			for(Employee e1:value)
//			{
//				System.out.println(e1);
//			}
//		}
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		System.out.println(entrySet);
		
		
		
		
//		Map<String,Long> collect = employee.stream().filter(e->e.getDepartment()=="BCA").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		System.out.println(entrySet);
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoin)).findFirst();
//		System.out.println(findFirst.get().getName());
//		System.out.println(findFirst.get().getYearOfJoin());
		
//		Optional<Employee> collect = employee.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
//		Employee employee2 = collect.get();
//		System.out.println(employee2.getName());
//		System.out.println(employee2.getAge());
		
//		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
//		employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getName).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Optional<Employee> max = employee.stream().max(Comparator.comparingDouble(Employee::getSallary));
//		Employee employee2 = max.get();
//		System.out.println(employee2.getName());
//		System.out.println(employee2.getSallary());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String , Long> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> entry :entrySet)
//		{
//			System.out.println(entry);
//		}
	
		
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
//		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		Map<String, Long> getGrnderHowManyTimeOccure = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = getGrnderHowManyTimeOccure.entrySet();
//		for(Entry<String, Long> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//        Optional<Employee> findFirst = employee.stream().filter(e->e.getAge()>25).sorted(Comparator.comparingDouble(Employee::getSallary)).findFirst();
//        System.out.println(findFirst.get().getName());
        
        

		
		
		
		
		//employee.stream().filter(e->e.getGender()=="Male" && e.getSallary()>25).map(Employee::getName).forEach(System.out::println);
		
		
		
//		Map<Boolean,List<Employee>> collect = employee.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
//		Set<Entry<Boolean,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<Boolean,List<Employee>> entry :entrySet)
//		{
//			System.out.println("=============");
//			System.out.println(entry.getKey());
//			List<Employee> value = entry.getValue();
//			for(Employee emp:value)
//			{
//				System.out.println(emp);
//			}
//		}
		
		
//		DoubleSummaryStatistics collect = employee.stream().collect(Collectors.summarizingDouble(Employee::getSallary));
//		System.out.println(collect.getSum());
//		System.out.println(collect.getAverage());
//		System.out.println(collect.getMax());
//		System.out.println();
		
		
//		Map<String,List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<String,List<Employee>> entry:entrySet)
//		{
//			System.out.println("------");
//			System.out.println(entry.getKey());
//			List<Employee> value = entry.getValue();
//			for(Employee emp:value)
//			{
//				System.out.println(emp);
//			}
//		}
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSallary)));
//		System.out.println(collect);
		
		
//		Map<String,Long> collect = employee.stream().filter(e->e.getDepartment()=="HR").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println();
		
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoin)).findFirst();
//		System.out.println(findFirst.get().getName());
//		System.out.println(findFirst.get().getYearOfJoin());
		
		
		
		
		
//		Optional<Employee> max = employee.stream().filter(e->e.getDepartment()=="HR").max(Comparator.comparingInt(Employee::getAge));
//		System.out.println(max.get().getName());
//		System.out.println(max.get().getAge());
		
		
		
		
		
		
		
		
		
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		Syso
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(collect);
		
		
//		employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getName).forEach(System.out::println);
		
		
//	    Optional<Employee> collect = employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//         System.out.println(collect.get().getName());
	    
	    
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		System.out.println(collect);
	    
		
		
		
//		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(collect);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Optional<Employee> max = employee.stream().max(Comparator.comparingInt(Employee::getAge));
//		System.out.println(max.get().getAge());
//		System.out.println(max.get().getName());
		
		
//		DoubleSummaryStatistics collect = employee.stream().collect(Collectors.summarizingDouble(Employee::getSallary));
//		System.out.println(collect.getAverage());
//		System.out.println(collect.getCount());
//		System.out.println(collect.getSum());
		
		
		
//		Map<String,List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<String,List<Employee>> entry:entrySet)
//		{
//			System.out.println("=========");
//			System.out.println(entry.getKey());
//			
//			List<Employee> value = entry.getValue();
//			
//			for(Employee e:value)
//			{
//				System.out.println(e);
//				
//			}
//		}
		
//		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSallary)));
//		System.out.println(collect);
		
		
//		Map<String,Long> collect = employee.stream().filter(e->e.getDepartment()=="BCS").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(collect);
		
		
		
		
		
		
		
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoin)).findFirst();
//		System.out.println(findFirst);
		
//		Optional<Employee> min = employee.stream().filter(e->e.getDepartment()=="HR" && e.getGender()=="Male").min(Comparator.comparingInt(Employee::getAge));
//		System.out.println(min);
		
		
		
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		System.out.println(collect);
		
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(collect);
//		
		
		//employee.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getName).forEach(System.out::println);
		
		
//		Optional<Employee> collect = employee.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSallary)));
//		System.out.println(collect.get().getName());
//		System.out.println(collect.get().getSallary());
		
		
		
//		Optional<Employee> collect = employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//		Employee employee2 = collect.get();
//		System.out.println(employee2.getName());
//		System.out.println(employee2.getSallary());
		
//		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//	    for(Entry<String , Double> entry:entrySet)
//	    {
//	    	System.out.println(entry);
//	    }
		
		
		
//		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(collect);
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		 Optional<Double> findFirst = employee.stream().filter(e->e.getAge()>25).map(e->e.getSallary()).sorted(Comparator.reverseOrder()).skip(3).findFirst();
//		 System.out.println(findFirst.get());
		 
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	   employee.stream().filter(e->e.getAge()> 25).map(Employee::getName).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
//		employee.stream().filter(e->e.getGender()=="Male" && e.getSallary()>25000).map(Employee::getName).forEach(System.out::println);
		
		
		
//		Optional<Employee> max = employee.stream().max(Comparator.comparingDouble(Employee::getAge));
//		System.out.println(max.get());
		
		
		
		
//		Optional<Integer> findFirst = employee.stream().map(e->e.getYearOfJoin()).sorted().findFirst();
//		System.out.println(findFirst.get());
		
//		Optional<Integer> findFirst = employee.stream().map(e->e.getYearOfJoin()).sorted(Comparator.reverseOrder()).findFirst();
//		System.out.println(findFirst.get());
		
		
//		Map<String,List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		Set<Entry<String,List<Employee>>> entrySet = collect.entrySet();
//		for(Entry<String,List<Employee>> entry:entrySet)
//		{
//			String key = entry.getKey();
//			System.out.println(key);
//			
//			List<Employee> value = entry.getValue();
//			for(Employee emp:value)
//			{
//				System.out.println(emp);
//			}
//			System.out.println("-------");
//		}
//		
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
		
//		
//		Map<String,Long> collect = employee.stream().filter(e->e.getDepartment()=="HR")
//		.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()
//				));
//		System.out.println(collect);
		
		
		
		
//		Optional<Employee> findFirst = employee.stream().sorted(Comparator.comparingDouble(Employee::getYearOfJoin)).findFirst();
//		System.out.println(findFirst.get().getName());
		
//		Optional<Employee> min = employee.stream().min(Comparator.comparingDouble(Employee::getYearOfJoin));
//		System.out.println(min.get().getName());
//		System.out.println(min.get().getYearOfJoin());
		
		
		
		
		
//		Optional<Employee> min = employee.stream().filter(e->e.getDepartment()=="HR" && e.getGender()=="Male")
//		                  .min(Comparator.comparingDouble(Employee::getAge));
//		System.out.println(min.get());
//		System.out.println(min.get().getName());
//		System.out.println(min.get().getAge());
		
		
		
		
		
		
		
		
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSallary)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> wntry:entrySet)
//		{
//			System.out.println(wntry);
//		}
		
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long> entry:entrySet)
//		{
//			System.out.println(entry);
//		}
		
//		employee.stream().filter(e->e.getYearOfJoin()>2015).map(e->e.getName()).forEach(System.out::println);
		
		
//		Optional<Employee> collect = employee.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSallary)));
//		System.out.println(collect.get().getName());
//	   System.out.println(collect.get().getSallary());
		
		
//		Optional<Employee> collect = employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//		System.out.println(collect.get().getName());
//		System.out.println(collect.get().getSallary());
		
//		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> entry:entrySet)
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		
		
		
//		employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String, Long>entry:entrySet)
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<Employee,String> collect = employee.stream().collect(Collectors.toMap(Function.identity(), Employee::getDepartment));
//		Set<Entry<Employee,String>> entrySet = collect.entrySet();
//		for(Entry<Employee, String> str:entrySet)
//		{
//			System.out.println(str);
//		}
		
//		List<Employee> collect = employee.stream().collect(Collectors.toUnmodifiableList());
//		for(Employee emo:collect)
//		{
//			System.out.println(emo);
//		}
		
		
//		Optional<Employee> findAny = employee.stream().findAny();
//		System.out.println();
		
		
		
//		boolean allMatch = employee.stream().allMatch(e->e.getGender()=="Male");
//		System.out.println();
		
		
		
		
//		boolean anyMatch = employee.stream().anyMatch(e->e.getName()=="Harshad");
//		System.out.println(anyMatch);
		
		
		
		
//		List<String> collect = employee.stream().map(e->e.getName()).collect(Collectors.toList());
//		for(String str:collect)
//		{
//			System.out.println(str);
//		}
		
		//employee.stream().map(e->e.getName()).forEach(System.out::println);
		
		
		//employee.stream().map(e->e.getName()).forEach(e->System.out.println(e));
		
		
		
		
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		Set<Entry<String,Double>> entrySet = collect.entrySet();
//		for(Entry<String, Double> entry:entrySet)
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(collect);
//		Set<Entry<String,Long>> entrySet = collect.entrySet();
//		for(Entry<String,Long> entry:entrySet)
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		
//		employee.stream().map(Employee::getDepartment).distinct().forEach(e->System.out.println(e));
		
		
//		Map<String,Long> collect2 = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(collect2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(collect);
//		
//		
//		employee.stream().filter(e->e.getSallary()>25000 && e.getGender()=="Male").map(Employee::getName).forEach(System.out::println);
//		
		
		
//		Optional<Employee> collect = employee.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSallary)));
//		System.out.println(collect);
		
		
		
//		Map<String,Double> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		System.out.println(collect);
		
		
		//employee.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<String,Long> collect = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(collect);
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	//	employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.));
		
		
		
		
		
		
		
	  
		
	
		
		//employee.stream().forEach(e->System.out.println(e) );
		
		
//		List<Integer> collect = employee.stream().map(e->e.getEid()).sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
//		System.out.println(collect);
		
		
		
		
//		
//		List<Employee> collect = employee.stream().limit(5).collect(Collectors.toList());
//		for(Employee e:collect)
//		{
//			System.out.println(e);
//		}
		 
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
