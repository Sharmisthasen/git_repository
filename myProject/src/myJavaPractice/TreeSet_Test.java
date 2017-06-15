package myJavaPractice;

import java.util.*;

public class TreeSet_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Info s1 = new Student_Info("ABC", 1, "I.T");
		Student_Info s2 = new Student_Info("BCD", 2, "I.T");
		Student_Info s3 = new Student_Info("CDF", 3, "I.T");
		
		
		TreeSet<Student_Info> ts = new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(ts);

	}

}
