package myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.*;
//import java.io.IOException;
//import java.util.Scanner;

public class CVSReader {
	
	void bufferRead() throws IOException{
		BufferedReader bf  = new BufferedReader(new FileReader("d:/Personal_info.csv"));
		String line = null;
		Scanner sc =  null;
		int index = 0;
		List<Personal_Info_Pojo> pi = new ArrayList<>();
		Personal_Info_Pojo pip = null;
		
		while((line = bf.readLine()) != null){
			System.out.println(line);
			pip = new Personal_Info_Pojo();
			sc = new Scanner(line);
			sc.useDelimiter(",");
			//System.out.println(sc.next()+"\n");
			while(sc.hasNext()){
				String s = sc.next();
				if(index == 0){
					pip.setName(s);
				}
				else if(index == 1){
					pip.setAddr(s);
					
				}
				else if (index == 2){
					pip.setGender(s);
				}
				else
					System.out.println("Invalid data...");
				index++;
				
			}
			index = 0;
			pi.add(pip);
		}
		sc.close();
		//System.out.println();
		
		for(Personal_Info_Pojo p : pi){
			
			System.out.println(p.getName()+"-||-"+p.getAddr()+"-||-"+p.getGender());
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CVSReader cvs = new CVSReader();
		
		try {
			cvs.bufferRead();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
