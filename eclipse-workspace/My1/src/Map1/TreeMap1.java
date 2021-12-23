package Map1;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> t1=new TreeMap<>();
t1.put(388,"Rahul");
t1.put(1,"Raja" );
t1.put(103, "Rohan");
System.out.println(t1);
System.out.println("the values are "+t1.values());
System.out.println("the keys are "+t1.keySet());
System.out.println(t1.get(334));
System.out.println(t1.containsKey(1002));
	}

}
