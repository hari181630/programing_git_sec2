package controlStatement;

public class ClassD {
	
public static void main(String[] args) {
	String s1="Hari ";
	String s2="i am velocity student";
	if(s1.equals("Hari")) {
		System.out.println("i am eligble to understand this method");
	}
	if(s1.equalsIgnoreCase("hari")) {
		System.out.println("this method is case sensitive");
	}
	System.out.println(s1.length());//length start from 1
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.indexOf('r'));//index start from 0
	System.out.println(s2.indexOf("velocity"));
	System.out.println(s2.indexOf('e',1));
	System.out.println(s2.replace(' ','*'));
	System.out.println(s2.replaceFirst("am", "was"));
	System.out.println(s2.endsWith("teacher"));//it tell false or true
	System.out.println(s1.concat( s2));
	System.out.println(s1.split(s2));//why shows error
	System.out.println(s2.startsWith("i"));
	System.out.println(s2.contains(" "));
	System.out.println(s2.intern());
}
}
