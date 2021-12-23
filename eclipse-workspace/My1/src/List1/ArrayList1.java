package List1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a1=new ArrayList<>();
a1.add("java");
a1.add("selenium");
a1.add("javascript");
System.out.println(a1);
for(String k:a1) {
	System.out.println(k);
}

ListIterator i1=a1.listIterator();
{
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
}

	}

}
