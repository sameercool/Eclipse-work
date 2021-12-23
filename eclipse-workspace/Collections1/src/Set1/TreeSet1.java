package Set1;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Object> t1=new TreeSet<>();
t1.add(10);
t1.add(30);
t1.add(60);
t1.add(5);
System.out.println(t1);
//poll first will retrieve and remove the first element from 
//the list
t1.pollFirst();
System.out.println(t1);
//poll last will retrieve and remove the last element from 
//the list
t1.pollLast();
System.out.println(t1);
	}

}
