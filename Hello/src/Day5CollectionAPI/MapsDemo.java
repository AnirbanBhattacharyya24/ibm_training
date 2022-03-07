package Day5CollectionAPI;

import java.util.HashMap;
//import java.util.Iterator;


public class MapsDemo {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("Scott", "Tiger");
		map.put("Jack", "Jill");
		map.put("Polo", "Lilli");
		map.put("Jack", "Rose");		
		
//		System.out.println("Scott : " + map.get("Scott"));
//		System.out.println("Polo : " + map.get("Polo"));
//		System.out.println("Jack : " + map.get("Jack"));
		
		System.out.println("For Iterating the keys : ");
		for(String e : map.keySet()){
		    System.out.println(e + " : " +map.get(e));
		}
//		
//		System.out.println("For Iterating the Values : ");
//		for(String e : map.values()){
//		    System.out.println(e);
//		}
		
//		System.out.println("For Iterating the keys : ");
//		for(String key : map.keySet()){
//		    System.out.println(key + " : " +map.get(key));
//		}
	
	}
}
