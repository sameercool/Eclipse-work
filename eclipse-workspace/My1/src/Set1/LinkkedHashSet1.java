package Set1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Object> l1=new LinkedHashSet<>();
l1.add(100);
l1.add("riya");
l1.add("raju");
l1.add(200);
l1.add("sham");
System.out.println(l1);
l1.add(100);
l1.add("sham");
System.out.println(l1);
l1.add(null);
System.out.println("after first null"+l1);
l1.add(null);
System.out.println("after 2nd null"+l1);
Iterator i1=l1.iterator();
{
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
	}
	}

}
