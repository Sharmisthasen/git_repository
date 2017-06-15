package myJavaPractice;

import java.util.ArrayList;
import java.util.List;

public class Math_Manupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final List<String> l = new ArrayList<>(); 
		
		l.add("Added 1st element");
		l.add("Added 2nd element");
		l.add("Added 3rd element");
		System.out.println(l);
		l.remove(0);
		l.set(0,"hello");
		System.out.println("After remove() & set() :"+l);
		

	}

}
