package myCollections;

public class FinalChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Bipul", "Mech");
		System.out.println("before Replace : \n"+MyStudentInterface.s);
		System.out.println("\n---------------------------------------------------\n");
		MyStudentInterface.s.replace(MyStudentInterface.s,s1);
		System.out.println("After Replace : \n"+MyStudentInterface.s);

	}

}
