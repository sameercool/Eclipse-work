package List1;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> v1=new Vector<>();
v1.add("Java");
v1.add("Selenium");
v1.add("javascript");
v1.add("html");
System.out.println(v1);
//this is used to find the no of elements in the vector
System.out.println("the size of vector is"+v1.size());
//this is used to find the capacity the vector holds
System.out.println("the capacity is"+v1.capacity());

	}

}
