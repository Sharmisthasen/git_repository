package myCollections;

import java.util.*;

public class Hash_Map_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> tm = new HashMap<>();
		tm.put("Aman",new Double(45000.00));
		tm.put("Binod",new Double(44030.00));
		tm.put("Kiran",new Double(56780.00));
		tm.put("Aman",new Double(67500.00));
		Set<Map.Entry<String,Double>> set = tm.entrySet();
		for(Map.Entry<String ,Double> me : set){
			System.out.print(me.getKey()+" : ");
			System.out.println(me.getValue());
			
		}

	}

}
