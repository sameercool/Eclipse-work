package List1;

import java.util.LinkedList;

public class Stack1 {

	public static void main(String[] args) {
		// TODOList
		LinkedList<Integer> l1=new LinkedList<>();
		l1.push(10);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		System.out.println(l1.pop());
		System.out.println(l1.pop());
	}

}
