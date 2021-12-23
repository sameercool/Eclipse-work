package Map1;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> h1=new HashMap<>();
h1.put(100, "rajeev");
h1.put(200, "Rajeev");
h1.put(300, "sonu");
System.out.println(h1);
h1.put(300,"sham");
System.out.println("after adding duplicate key");
System.out.println("All keys"+h1.keySet());
System.out.println("particular value "+h1.get(100));
System.out.println("check key "+h1.containsKey(300));
System.out.println("check value "+h1.containsValue("rajeev"));

	}

}
