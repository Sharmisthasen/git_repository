package myJavaPractice;

import java.util.HashSet;
import java.util.Set;

public class MyEmp {

	String name;
	String dob;
	int salary;
	
	MyEmp(String name, String dob , int salary){
		
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		
	}
	
	@Override
	public boolean equals(Object o){
		MyEmp e = (MyEmp)o;
		if(this.name == e.name && this.dob == e.dob && this.salary == e.salary)
		return true;
		else
			return false;
		
	}
	
	
	
 @Override
	public int hashCode() {
		int result = 1;
		result =  result +((name == null)? 0 : name.hashCode());
		result = result + ((dob == null)? 0 : dob.hashCode());
		result = result + salary;
		
		 
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyEmp e1 = new MyEmp("abc","12/02/1986",20000);
		MyEmp e2 = new MyEmp("xyz", "30/07/1988", 17000);
		MyEmp e3 = e1;
		MyEmp e4 = new MyEmp("abc","12/02/1986",20000);
		System.out.println("e1.equals(e2)"+e1.equals(e2)+" \n hashcode of e1-->"+e1.hashCode()+"\n hashcode of e2 -> "+e2.hashCode());
		System.out.println("e1.equals(e3)"+e1.equals(e3)+" \n hashcode of e1-->"+e1.hashCode()+"\n hashcode of e3 -> "+e3.hashCode());
		Set setl = new HashSet();
		setl.add(e1);
		setl.add(e2);
		setl.add(e4);
		System.out.println("setl.size() "+setl.size());
		

	}

}
