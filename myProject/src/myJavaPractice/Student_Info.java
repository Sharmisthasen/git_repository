package myJavaPractice;

public class Student_Info implements Comparable<Student_Info> {

	String name;
	int rollno;
	String branch ; 
	public Student_Info(String name, int rollno, String branch) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
		
	}
	@Override
	public String toString(){
		return "Name : "+name+" \n Roll no : "+rollno+"\n Branch  : "+branch;
		
	}
	@Override
	public int compareTo(Student_Info o) {
		// TODO Auto-generated method stub
		
		return this.rollno - o.rollno;
	}
}
