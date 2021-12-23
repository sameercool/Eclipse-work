package List1;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> v1=new Vector<>();
v1.add("tiger");
v1.add("lion");
v1.add("elephant");
System.out.println("capacity"+v1.capacity());
System.out.println("size is"+v1.size());
v1.add("leopard");
v1.add("panther");
v1.add("deer");
System.out.println("the size 2 is"+v1.size());
System.out.println("the capacity 2 is"+v1.capacity());
	}

}
