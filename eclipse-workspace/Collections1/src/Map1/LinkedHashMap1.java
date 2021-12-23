package Map1;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String> l1=new LinkedHashMap<>();
l1.put(101,"ramesh");
l1.put(102, "raju");
l1.put(103, "sham");
System.out.println("the key values are"+l1.keySet());
System.out.println("the values are "+l1.values());
System.out.println("is raju present"+l1.containsValue("raju"));
l1.put(null, "pooja");
System.out.println(l1);
l1.put(null, "seema");
System.out.println(l1);
	}

}
