package Set1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Object> t1=new TreeSet<>();
t1.add(10);
t1.add(20);
t1.add(30);
t1.add(40);
t1.add(50);
System.out.println(t1);
t1.pollFirst();
System.out.println(t1);
t1.pollLast();
System.out.println(t1);
Iterator i1=t1.iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
	}

}
