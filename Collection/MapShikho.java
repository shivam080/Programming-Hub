import java.util.*;


public class MapShikho{
	
	public static void main(String [] ar)

	{
	  TreeMap m = new TreeMap();
	  m.put("key","124");
	  m.put("no",23);
	  m.put("add",null);
	 // m.put(null,null);
	//  m.put(1,"sum");
	  System.out.println("Map "+ m);
	 // m.remove("key");

		System.out.println("MapKeySet "+ m.keySet());
		System.out.println("MapValue "+ m.values());
	  Set set = m.entrySet();
 		set.forEach(System.out::println);
     // System.out.println(m.entrySet());
    //  System.out.println(set);
      Iterator itr = set.iterator();

      while(itr.hasNext())
      {

      	Map.Entry map = (Map.Entry)itr.next();
      	System.out.println(map.getKey() + " $ " + map.getValue());
      }


	}

}