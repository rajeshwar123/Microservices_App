package com.nt.Array2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPractice {

	public static void main(String[] args) {

		// list contains emp list
		List<Employee> employees = new ArrayList();

		// map contains emp id and emp
		Map<Integer, Employee> empMap = new HashMap<>();

		employees.add(new Employee(101, "Rajesh", "Pune"));
		employees.add(new Employee(102, "Akash", "Delhi"));
		employees.add(new Employee(103, "Roshan", "Mumbai"));
		employees.add(new Employee(104, "Shubham", "Pune"));
		employees.add(new Employee(105, "Vikas", "Pune"));
		employees.add(new Employee(106, "Vijay", "Pune"));
		employees.add(new Employee(107, "Ramesh", "Pune"));
		/*
		 * for (Employee e : employees) { System.out.println(e); }
		 */
		System.out.println();

		/*
		 * employees.forEach(e -> { if (e.getCity() == "Pune") { empMap.put(e.getId(),
		 * e); } });
		 */

		/*
		 * Set<Entry<Integer, Employee>> set= empMap.entrySet(); set.forEach(s->{
		 * System.out.println(s); });
		 * 
		 */
		Stream<Employee> streamEmp = employees.stream();

		List<Employee> FilteredlistEmp = streamEmp.filter(emp -> emp.getCity().contains("Mumbai"))
				.collect(Collectors.toList());

		employees.forEach(emp -> {
			if (emp.getCity().equalsIgnoreCase("Mumbai")) {
		     empMap.put(emp.getId(), emp);
			}
		});
		
		System.out.println(empMap);
	}
}