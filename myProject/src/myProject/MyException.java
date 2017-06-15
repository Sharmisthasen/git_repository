package myProject;

import javax.management.BadStringOperationException;
import javax.swing.text.BadLocationException;

public class MyException {
	
	void method1() //throws ArithmeticException
	{
		/*try{
		method2();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}*/
		//try {
			method2();
		//} catch (ClassCastException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		int i = 12, j= 19;
		i= i+j;
		System.out.println("Value of I = "+i);
		
	}
	void method2(){
		System.out.println("Method2 throw Arithmetic Exception");
		String s ="exception";
		throw new Error();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		MyException obj = new MyException();
		obj.method1();
		}
		catch(Error e){
			e.printStackTrace();
			System.out.println("catch block");
		}
		finally{
			System.out.println("finally block");
		}
	}

}
