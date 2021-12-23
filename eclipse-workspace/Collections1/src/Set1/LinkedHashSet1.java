package Set1;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Object> l1=new LinkedHashSet<>();
l1.add("java");//0
l1.add(100);//1
l1.add(29);//2
l1.add("selenium"); //3
l1.add(30.95); //4
System.out.println(l1);
//let us add a duplicate value
l1.add("java");
System.out.println("after adding duplicate elements "+l1);
l1.add(null);
System.out.println("after adding a null value to set "+l1);
l1.add(null);
System.out.println("adding 2nd null "+l1);
System.out.println("We are inside the iterator block");

Iterator i1=l1.iterator();
{
while(i1.hasNext())	{
	System.out.println(i1.next());
}
}

	}

}
