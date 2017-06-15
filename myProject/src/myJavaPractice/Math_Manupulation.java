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
		
		final int [] i = new int[5];
		i[0]=250;
		System.out.println(i[0]);
		int j, k;
		System.out.println("inside for loop assigning value to array");
		for(j = 10,k=0; k<5; j+=10,k++){
		   	i[k]=j;
		   	System.out.println(i[k]);
		}
		System.out.println("Befor changing the value of fianl variable :"+Final_Variable.i[4]);
		Final_Variable.i[4]=20;
		System.out.println("After changing the value of Final_variable of a interface : "+Final_Variable.i[4]);
		

	}

}
