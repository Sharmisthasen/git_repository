package myProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadCVSOnlyScanner {
	File f = new File("d:/Personal_info.csv");
	Scanner s = null;
	String s2 [] = null;
	void ScannerMethod() throws IOException{
		 s = new Scanner(f);
		 
		s.useDelimiter(",");
		//s.findInLine(",");
		while(s.hasNext()){
			String s1 = s.nextLine();
			System.out.println(s1);
			
			
		}
		
			
			
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadCVSOnlyScanner rcs = new ReadCVSOnlyScanner();
		try {
			rcs.ScannerMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
