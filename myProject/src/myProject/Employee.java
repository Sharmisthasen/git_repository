package myProject;

public class Employee// implements Comparable<Employee>{
{
	String name;
	int age;
	float salary;
	Employee(String name , int age , float salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
				
	}
	@Override
	public String toString(){
		
		return "Employee name : "+name +" age :  "+age+" salary :"+salary+"\n";
	}

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		int i = this.name.compareTo(o.name);
//		return -i;
//	}

}
