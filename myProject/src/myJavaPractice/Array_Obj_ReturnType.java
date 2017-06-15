package myJavaPractice;

public class Array_Obj_ReturnType {
	String s1 = "Hello";
	public String[] list_name(){
		String s[] = new String[5];
		for(int i = 0 ;i < s.length;i++){
			
			s[i] =s1.substring(i, s.length);;
			
			
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Obj_ReturnType ar = new Array_Obj_ReturnType();

		//String s = null;
		//int  i = 0 ;
		for(String s : ar.list_name())
		System.out.println(s);
	}

}
