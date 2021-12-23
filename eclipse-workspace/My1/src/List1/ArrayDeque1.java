package List1;

import java.util.ArrayDeque;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> d1=new ArrayDeque();
d1.add(30);
d1.add(40);
d1.add(50);
d1.add(60);
d1.add(70);
System.out.println(d1);
d1.addFirst(0);
System.out.println(d1);
d1.addLast(100);
System.out.println(d1);
d1.removeFirstOccurrence(0);
d1.removeLastOccurrence(100);
System.out.println(d1);
for(Integer a:d1) {
	System.out.println(a);
}

	}

}
