package Queue1;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> q1=new PriorityQueue<>();
q1.add("Java");
q1.add("Selenium");
q1.add("javascript");
q1.add("html");
//queue follows first in first out
System.out.println("the first element is "+q1.peek());
//poll will get the first element and
//remove that in the next execution
System.out.println("the poll is "+q1.poll());
System.out.println("is the first element java present "+q1.contains("java"));
	}

}
