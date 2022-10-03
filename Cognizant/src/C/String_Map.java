package C;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class String_Map {

	public static void main(String[] args) {
		String s1="Selenium";
		char s2[]=s1.toCharArray();
		Map<Character,Integer> mp = new HashMap();
		for(Character ch:s2) {
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch, 1);
			}
		}
		Set<Character> s21=mp.keySet();
		for(Character ch:s21) {
			if(mp.get(ch)>1) {
				System.out.println("character"+ch+"repeating"+mp.get(ch));
			}
		}
		
		

	}

}
