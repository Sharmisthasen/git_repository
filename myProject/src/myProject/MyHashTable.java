package myProject;
import java.util.*;

public class MyHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,String> ht = new Hashtable<>(); 
		
		ht.put("1", "FirstValue");
		ht.put("2", "SecondValue");
		ht.put("3", "ThirdValue");
		ht.put("4", "ForthValue");
		for(String s : ht.keySet()){
			System.out.println("Key : "+s+" value : "+ht.get(s)+"hashcode : "+s.hashCode());
		}
		System.out.println("----------------------------------------------");
		
		for(String s : ht.keySet()){
			System.out.println("Key : "+s+" value : "+ht.get(s));
		}
		
		

	}

}
