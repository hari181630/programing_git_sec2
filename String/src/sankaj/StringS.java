package sankaj;

public class StringS {
public static void main(String[] args) {
	String s = "Hari Burewar";//heap area//string pool area//constant pool area
	String s1 = new String("Paraji Burewar");//heap area//string pool area//non-constant pool area
	String s2="Usha";
	String s3="Usha";
	String s4="usha";
	String s5="Usha";
	String s6 = new String("sha");
	String s7= new String("Usha");
//	System.out.println(s2.equals(s3));
//	System.out.println(s2.equals(s1));
//	System.out.println(s2.equals(s4));
	System.out.println(s2.equals(s6));
//	System.out.println(s2.equalsIgnoreCase(s6));
//	
	System.out.println(s2 == s3);
	
	

	
}
}
