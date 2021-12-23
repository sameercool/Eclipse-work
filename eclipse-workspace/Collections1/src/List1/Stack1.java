package List1;

import java.util.LinkedList;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> s1=new LinkedList<>();
s1.push(50);
s1.push(10);
s1.push(25);
s1.push(80);

System.out.println(s1.pop());//80
System.out.println(s1.pop());//20
System.out.println(s1.pop());//10
System.out.println(s1.pop());//50
	}

}
