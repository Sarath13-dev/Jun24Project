package org.demo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Implementation {
	
	
	
	public static void main(String[] args) {
		
		Launch l = new Launch("Ravi", 30, 10000);
		Launch l1 = new Launch("Ram", 40, 20000);
		Launch l2 = new Launch("Babu", 50, 30000);
		
		ArrayList<Launch> al = new ArrayList<>();
		al.add(l);
		al.add(l1);
		al.add(l2);
		
		
		Function<Launch, Integer>  f = emp -> {
			
			int age = emp.getAge();
			
			if(age >= 40) {
				
				int salary = emp.getSalary();
				int bonous = salary*(5/100);
				return bonous;
			}
			else {
				return 0;
			}
			
			
		};
		
		
		Predicate<Launch> p = emp1 -> {
			
			if(emp1.getAge()>=40) {
				return true;
			}
			
			else {
				return false;
			}
			
		};
		
		
		for(int i=0; i<al.size(); i++) {
			Launch launch = al.get(i);
			boolean test = p.test(launch);
			if(test) {
				Integer apply = f.apply(launch);
				System.out.println(launch.getName()+" "+
				launch.getAge()+" "+" "+launch.getSalary()+" "+apply);
			}
			
		}
		
	}

}
