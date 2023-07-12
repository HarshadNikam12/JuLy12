//package com.tech.singlton;
//
//import java.lang.reflect.Constructor;
//
//public class Test 
//{
//	public static void main(String[] args) {
//		
//	
//	Employee e=Employee.getEmployee();
//	System.out.println(e.hashCode());
//	
//	Employee ee=Employee.getEmployee();
//	System.out.println(ee.hashCode());
//	
//	 try {
//         Constructor[] constructors
//             = Employee.class.getDeclaredConstructors();
//         for (Constructor constructor : constructors) {
//             // Below code will destroy the singleton
//             // pattern
//             constructor.setAccessible(true);
//            
//                 = (Employee)constructor.newInstance();
//             break;
//         }
//     }
//
//     catch (Exception e) {
//         e.printStackTrace();
//     }
//
//	
//	}
//	
//
//}
