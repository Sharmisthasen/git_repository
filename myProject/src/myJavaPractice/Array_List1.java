package myJavaPractice;

import java.util.*;

public class Array_List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> copy = new ArrayList<>();
		copy.add("A_COPY");
		copy.add("B_COPY");
		copy.add("C_COPY");
		copy.add("D_COPY");
		ArrayList<String> al = new ArrayList<>();
		al.ensureCapacity(11);
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("C");
		al.add("D");
		al.add("A");
		al.add("E");
		al.addAll(3,copy);
		System.out.println("Size of the array list is : "+al.size());
		
		for(String s : al){
			System.out.println(s);
			
		}
		
		//al.remove("C");
		//System.out.println(al);
		

	}

}
