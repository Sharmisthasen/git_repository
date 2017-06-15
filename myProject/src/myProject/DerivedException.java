package myProject;

public class DerivedException extends Exception{
	String s= null;
	
	public DerivedException() {
		// TODO Auto-generated constructor stub
		s= "exception occur";
		
	}
	
	
	public String toString(){
		return s;
		
	}
}
