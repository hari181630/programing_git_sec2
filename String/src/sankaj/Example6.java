package sankaj;

public class Example6 {
public static void main(String[] args) {
	String s1=" Payal Wagh";
	String s2=" Payal Burewar";
	System.out.println(s1.replace("Wagh", "Burewar"));
	System.out.println(s1.replace('a', 'P'));
	System.out.println(s1.replace('a', 'B'));
	System.out.println(s1.replaceAll("Payal Wagh", "Priyanka lahe"));
	System.out.println(s1.substring(6));
	System.out.println(s2.substring(6));
	System.out.println(s1.substring(6, 8));
	System.out.println(s1.subSequence('P', 'l'));
}
}
