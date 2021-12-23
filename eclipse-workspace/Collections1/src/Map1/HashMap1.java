package Map1;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> h1=new HashMap<>();
h1.put(101,"ramesh");
h1.put(102, "raju");
h1.put(103, "sham");
System.out.println(h1);
h1.put(103, "ram");
System.out.println("after adding duplicate value"+h1.keySet());
System.out.println("to get all values"+h1.values());
	}

}
