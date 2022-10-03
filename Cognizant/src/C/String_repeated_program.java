package C;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class String_repeated_program {

	public static void main(String[] args) {
		String str ="java Programing";
		char[] chars=str.toCharArray();
		Map<Character,Integer> charMap =new HashMap<>();
		for(Character ch:chars) {
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		Set<Character> keys=charMap.keySet();
		for(Character ch:keys)
		{
			if(charMap.get(ch)>1)
			{
				System.out.println("character"+ch+"repeating"+charMap.get(ch));
			}
		}
		
	}

}
