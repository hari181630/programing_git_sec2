package sankaj;

public class Example2 {
public static void main(String[] args) {
	String x1="Hari Burewar";
	String x2="Paraji Burewar";
	char x[]= {'a','b','c','d','e','f'};
	
	char y[]=x2.toCharArray();
	String x3="Paraji Burewar";
	//measure a string length with the help of length()
	System.out.println(x1.length());
	System.out.println(x2.charAt(0));
	//System.out.println(x2.chars());
	System.out.println(x1.charAt(8));
	System.out.println(x1.toUpperCase());
	 x2=x2.toUpperCase();
	 System.out.println(x2);
	 System.out.println(x2.equals(x3));
	
}
}
