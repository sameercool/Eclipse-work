package Map1;

import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> t1=new TreeMap<>();
t1.put(101,"ramesh");
t1.put(102, "raju");
t1.put(103, "sham");
System.out.println(t1);
t1.put(null, "seema");
System.out.println(t1);
	}

}
