package List1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> l1=new LinkedList<>();
l1.add("Java");
l1.add("Selenium");
l1.add("javascript");
l1.add("html");
System.out.println(l1);
//adding one more element to the starting of the linkedlist
l1.addFirst("Python");
l1.addLast("postman");

System.out.println("output after adding first and last element is "+l1);
System.out.println("this is for each block");
for(String k:l1) {
	System.out.println(k);
}
System.out.println("this is iterator block");
ListIterator l2=l1.listIterator();
while(l2.hasNext())
	{
	System.out.println(l2.next());
	}}

}
