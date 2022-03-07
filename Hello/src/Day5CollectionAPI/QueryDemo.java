package Day5CollectionAPI;

import java.util.LinkedList;
import java.util.Queue;

public class QueryDemo {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
//		System.out.println(que.peek());  //Fetch Value but doesn't remove
//		
//		while(!que.isEmpty())
//			System.out.println(que.poll());  //Fetch Value and remove from queue
//		
		for(String e : que)
			System.out.println(e);
	}

}
