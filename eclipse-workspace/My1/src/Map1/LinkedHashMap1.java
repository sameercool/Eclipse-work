package Map1;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String> l1=new LinkedHashMap<>();
l1.put(388,"Rahul");
l1.put(1,"Raja" );
l1.put(103, "Rohan");
System.out.println(l1);
System.out.println(l1.values());
System.out.println(l1.keySet());
System.out.println(l1.containsKey(388));
l1.put(101,"sanju");
l1.put(103, "pooja");
System.out.println("after adding duplicate keys "+l1);
l1.put(null,"pooja 2.0");
System.out.println(l1);
l1.put(null,"pooja 3.0");
System.out.println(l1);

	}

}
