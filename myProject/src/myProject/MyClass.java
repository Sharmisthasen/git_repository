package myProject;

public class MyClass {

	
	private final int i ;
	private final int j = 25;
	
	MyClass(int  i){
		this.i = i;
		//this.j  = i ;
	}
	
	/*public void myMethod(int i){
		this.i = i;
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass obj1 = new MyClass(10);
		MyClass obj2 = new MyClass(20);
		 System.out.println("Value of i for Obj1 "+obj1.i);
		 System.out.println("Value of i for Obj2 "+obj2.i);
		 System.out.println("Value of j for Obj1 "+obj1.j);
		 System.out.println("Value of j for Obj1 "+obj2.j);
		 //obj1.i = 30;
		
	}

}
