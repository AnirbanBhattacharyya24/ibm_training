package Day5CollectionAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.addFirst("Apple");
		lst.addLast("Apache");
		lst.add(2,"Oracle");
		
		System.out.println("Iteration using for loop");
		for(int i=0;i<lst.size();i++)
				System.out.println(lst.get(i));
		
		System.out.println("Iteration using iterator");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Iteration using for-each");
		for(String e : lst)
			System.out.println(e);
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");
		
		ar.addAll(lst);
		System.out.println("--Iterating Over merged Collection");
		for(String e : ar)
			System.out.println(e);
		
		HashSet<String> set = new HashSet<String>(ar);
		System.out.println("--Iterating Over set Collection");
		for(String e : set)
		System.out.println(e);

		TreeSet<String> tree = new TreeSet<String>(set);
		System.out.println("--Iterating Over sorted Collection");
		for(String e : tree)
		System.out.println(e);

	}

}
