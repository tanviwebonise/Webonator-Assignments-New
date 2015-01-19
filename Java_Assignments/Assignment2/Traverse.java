import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import java.util.Iterator;


public class Traverse
{
	public static void main(String a[])
	{
        ArrayList<String> al = new ArrayList<String>();
        al.add("Tanvi");
        al.add("Ashvini");
        al.add("Divya");
        al.add("Sayali");
        Iterator<String> itr = al.iterator();
        System.out.println("Traversing using ArreyList");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        HashMap<String, String> h = new HashMap<String, String>();
        
        h.put("1st", "Hello world");
        h.put("2nd", "Feeling good!");
        h.put("3rd","Good morning people..");
        Set<String> keys = h.keySet();
        System.out.println("Traversing using Hashmap");
        for(String key: keys){
            System.out.println("Data at "+key+" position : "+h.get(key));
        }
        
    }
}
