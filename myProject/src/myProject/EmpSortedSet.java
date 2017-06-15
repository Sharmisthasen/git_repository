package myProject;

import java.util.*;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmpSortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1  = new Employee("katty", 30 , 25000);
		Employee e2  = new Employee("Annie", 32 , 35000);
		Employee e3  = new Employee("pinto", 34 , 27000);
		Employee e4  = new Employee("binaco", 40 , 51000);
		TreeSet<Employee> s  = new TreeSet<Employee> ();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		
		System.out.println(s);
		Iterator <Employee> i = s.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		//System.out.println("s.ceiling(e3) :"+s.floor(e4));

	}

}
