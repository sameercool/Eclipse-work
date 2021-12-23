package List1;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> p1=new PriorityQueue<>();
p1.add("java");
p1.add("selenium");
p1.add("AWS");
p1.add("HTML");
p1.add("CSS");
System.out.println(p1);
System.out.println(p1.peek());
p1.poll();
System.out.println(p1);
System.out.println(p1.contains("AWS"));
	}

}
