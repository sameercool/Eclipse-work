package List1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importing the arraylist from java util package
ArrayList<String> a1=new ArrayList<>();
//adding elements to the arraylist
a1.add("Java");
a1.add("Selenium");
a1.add("javascript");
a1.add("html");
System.out.println(a1);
a1.add("css");
a1.add("c++");
System.out.println(a1);
System.out.println("this is iterator block");
ListIterator l1=a1.listIterator();
while(l1.hasNext()) {
	System.out.println(l1.next());
}
System.out.println("this is for each loop block");
for(String i:a1) {
	System.out.println(i);
}
	}

}
