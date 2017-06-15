package myJavaPractice;

public class ChildClass extends ParentClass {
	
	@Override
	void display() throws ArithmeticException{
		
		int i = 10 ; 
		System.out.println("value of i = "+i);
		throw new ArithmeticException();
		
		
	}
	
	public static void main (String[] args){
		ParentClass c  = new ChildClass();
		try{
		c.display();
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception thrown"+e.getClass());
			
		}
		
	}

}
