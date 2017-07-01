package myJavaPractice;

public class ImplMyInterface {
	int i = 10 , j = 20;
	String name = "Tuli";
	
	
	void myMethod(MyInterface m){
		String s = MyInterface.s.replace("Hello","hi");
		System.out.println(s+" \nAddition of I n J  = "+m.add(i, j));
		System.out.println("My name is "+m.printName(name));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplMyInterface m1 = new ImplMyInterface();
		
		
		m1.myMethod((new MyInterface(){
			@Override
			public int add(int i, int j) {
				// TODO Auto-generated method stub
				
				return i+j;
			}

			@Override
			public String printName(String name) {
				// TODO Auto-generated method stub
				
				return name;
			}
			}
			));
		 

	}

}
