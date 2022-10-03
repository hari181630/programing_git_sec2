package From27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollationList {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Velocity");//add method take only one argument
		list.add("is");
		list.add("in");
		list.add("katraj");
//		System.out.println(list);
//		System.out.println(list.size());
//		list.clear();
//		System.out.println(list);
		Iterator <String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it.clear();
		System.out.println("=============================================");
		for(String s1:list) {
			System.out.println(s1);
		}
	}

}
