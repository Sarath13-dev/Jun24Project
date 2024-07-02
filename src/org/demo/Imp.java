package org.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Imp {
	
	public static void main(String[] args) {
		
//		Employee e = new Employee("Ravi", 10000, 30);
//		Employee e1 = new Employee("Babu", 20000, 40);
//		Employee e2 = new Employee("Suresh", 30000, 50);
//		
//		List<Employee> li = new ArrayList();
//		li.add(e);
//		li.add(e1);
//		li.add(e2);
		
//		//list of Employees grater than equals 20000
//		Predicate<Employee> p = emp -> emp.getEmpSalary() >=20000;
//		Function<Employee, String> ff = emp1 -> emp1.getEmpName();
//		li.stream().filter(p).map(ff).forEach(System.out::println);
		
//		li.stream().filter(emp-> emp.getEmpSalary() >=20000).map(emp1 -> emp1.getEmpName()).forEach(System.out::println);
		
		
	//	li.stream().map(emp -> emp.getEmpName().charAt(2)).sorted().forEach(System.out::println);
		

//		List<Integer> li = new ArrayList();
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(40);
//		
//		//li.stream().limit(2).forEach(System.out::println);
//		
//		//li.stream().skip(2).forEach(System.out::println);
//		
//		System.out.println(li.stream().reduce((no1, no2)-> no1+ no2).get());
//	
		
		
		Map<String, Integer> m = new HashMap();
		m.put("java", 100);
		m.put("maven", 200);
		m.put("framework", 300);
		
//		//to print keys alone
//		m.keySet().stream().forEach(System.out::println);
		
//		//to print all the values of the map
//		m.values().stream().forEach(System.out::println);
		
//		m.keySet().stream().sorted().forEach(System.out::println);
		
//		m.values().stream().sorted().forEach(System.out::println);
		
		m.keySet().stream().filter(s1 -> s1.endsWith("n")).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

}
