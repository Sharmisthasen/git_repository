package myProject;

public class CustomExceptionImpl {
	int k ;

	void m1()throws DerivedException{
		
		int i = 2,j = 3;
		 k = i + j ;
		 System.out.println(k);
		 throw new DerivedException();
		 
	}
	
	void m2() throws DerivedException{
	
		
			m1();
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomExceptionImpl ce = new CustomExceptionImpl();
		try {
			ce.m2();
			
		} catch (DerivedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("hi");
		System.out.println(ce.k);
	}

}
