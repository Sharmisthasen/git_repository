package myProject;

public class PassValRef {
	
//	static int i = 10 , j = 20;
//	int a = 100 , b = 200;
//	static PassValRef p = new PassValRef();
//	
	void swap (Point p1){
//		int temp = 0;
//		temp = i;
//		i = j;
//		j = temp;
//		System.out.println("After swap i = "+i+"j = "+j);
//		
		//p1.display();
		p1.i = 200;
		//p1.display();
		
	}
	
//	void swap(int i , int j){
//		int temp = 0;
//		System.out.println("Before swap i = "+i+" j = "+j);
//		temp = i ;
//		i = j ; 
//		j = temp;
//		System.out.println("After swap i = "+i+" j = "+j);
//		
//		
//	}
//
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		p.swapping();
//		
//		
//	
		Point p  = new Point();
		PassValRef obj = new PassValRef();
		p.display();
		obj.swap(p);
		p.display();
   }
//	void swapping(){
//		
//		System.out.println("Before swaping i = "+i+" and j = "+j);
//		System.out.println("Outside method After swaping i = "+i+" and j = "+j);
//		p.swap();
//		
//		p.swap(p.a, p.b);
//		System.out.println("Outside method After swaping a = "+p.a+" and b = "+p.b);
//		int temp = p.a;
//		p.a = p.b;
//		p.b = temp;
//		System.out.println("sawping in main method method After swaping a = "+p.a+" and b = "+p.b);
//	}
	
	
}
