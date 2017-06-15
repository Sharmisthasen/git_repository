package myProject;

import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al = new ArrayList<>();
		al.add("Abc");
		al.add("hello");
		al.add("hello");
		al.add("hello");
		al.add("boy");
		al.add("boy");
		al.add("cat");
		System.out.println(al.lastIndexOf(al.get(1))+","+al.subList(0, 3));

	}

}
