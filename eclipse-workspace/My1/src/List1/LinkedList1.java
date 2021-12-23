package List1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> l1=new LinkedList<>();
l1.add("Selenium");
l1.add("java");
l1.add("appium");
l1.add("restassured");
System.out.println(l1);
l1.addFirst("Automation");
l1.addLast("Manual");
l1.set(1, "python");
System.out.println(l1);
System.out.println("this is iterator block:");
ListIterator l3=l1.listIterator();
while (l3.hasNext()) {
	System.out.println(l3.next());
	
}
	}

}
