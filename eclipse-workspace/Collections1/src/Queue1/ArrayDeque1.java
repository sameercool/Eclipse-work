package Queue1;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> a2=new ArrayDeque<>();
a2.add(15);
a2.add(10);
a2.add(20);
a2.add(5);
System.out.println(a2);
a2.addFirst(12);
System.out.println(a2);
a2.addLast(0);
System.out.println(a2);
a2.removeFirstOccurrence(12);
a2.removeLastOccurrence(0);
System.out.println(a2);

	}

}
