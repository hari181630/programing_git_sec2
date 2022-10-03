package logical_program_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Repeated_World_String {

	public static void main(String[] args) {
		String str="Sillyspider";
		char y[]=str.toCharArray();
		int size=y.length;
		Map<Character,Integer> map = new HashMap<>();
		int i=0;
		while(i != size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldvalue=map.get(y[i]);
				int newvalue=oldvalue + 1;
				map.put(y[i], newvalue);
			}
			i++;
		}
		String s ="";
		for(Map.Entry<Character,Integer> data : Ihmap)
		{
			s=s +data.getKey();
		}
	}
}