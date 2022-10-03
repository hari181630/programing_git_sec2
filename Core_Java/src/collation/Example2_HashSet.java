package collation;

import java.util.HashSet;
import java.util.Iterator;

public class Example2_HashSet {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add("100");//inseration order is randomaly
	hs.add("Hari");//not duplicate element are allowed
	hs.add('H');//all types of data stored
	hs.add(34.3f);//storage type is hashtable means first generate address then generate data
	hs.add('H');//null value allow only one except treeset because treeset not allowed value 
	hs.add(null);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);//print all data
	System.out.println(hs.size());//count data size not count duplicate data
	System.out.println(hs.isEmpty());//false
	System.out.println(hs.contains('H'));//true
	System.out.println("----------------------print hashSet data--------------");
	Iterator storeaddre = hs.iterator();//parent of all collection
	while(storeaddre.hasNext())
	{
		System.out.println(storeaddre.next());
	}
	System.out.println("--------using for each print all data---------");
	for(Object data:hs) {
		System.out.println(data);
	}
	System.out.println(hs.size());
	hs.clear();
	//System.out.println(hs.clear());
	System.out.println(hs.size());
	
	
}
}
