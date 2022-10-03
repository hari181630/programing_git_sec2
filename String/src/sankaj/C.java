package sankaj;

public class C {
public static void main(String[] args) {
	String s1="String";
	String s2="string";
	String s3="learn String";
	String s4="string";
	String s5="STRING";
	System.out.println(s2.equals(s4));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s5));
	System.out.println(s4.equals(s2.toUpperCase()));
	String s11="Hari Burewar";
	String s12="war";
	System.out.println(s11.contains(s12));
	System.out.println(s2.equalsIgnoreCase(s5));
	System.out.println(s3.contains(s1));
	System.out.println(s2.contentEquals("ing"));
	System.out.println(s2.contains("ing"));//("ing"));
	System.out.println(s3.charAt(7));
}
}
