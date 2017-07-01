package myCollections;

public class Student {
	private String name;
	private String stream;
	
	public Student(String name , String stream){
		this.name = name;
		this.stream = stream;
	}
	
	@Override
	public boolean equals(Object s){
		Student s1 = (Student)s;
		if(this.name.equals(s1.name) && this.stream.equals(s1.stream))
			return true;
		else
		return false;
		
	}

	public Student replace(Student oldStudent ,Student newStudent){
		if (oldStudent.equals(newStudent)){
			this.name= oldStudent.name;
			this.stream = oldStudent.stream;
		}
		else{
			this.name= newStudent.name;
			this.stream = newStudent.stream;

		}
		return this;
		
	}
	@Override
	public String toString(){
		return "Name : "+name+"\n"+"Stream : "+stream;
		
	}
	public static void main(String[] args){
		Student s1 = new Student("Abc","IT");
		Student s2 = new Student("Abd","IT");
		Student s3 = new Student("www", "Computer");
		s2.replace(s2,s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2);
		
		
	}
}
