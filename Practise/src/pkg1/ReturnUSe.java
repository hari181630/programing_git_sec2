package pkg1;

public class ReturnUSe {
	
private static final String String = null;
public static void main(String[] args) {
	java.lang.String x2=m1();
	System.out.println(x2);
	int x3=m1(3452);
	System.out.println(x3);
}
public static String m1() {
	String x1="Hari#Burewar#";
	int count=0;
	for(int i=0;i<x1.length();i++) {
		if(x1.charAt(i)!='#') {
			count++;
		}
		
	}
	System.out.println(count);
	return String;
}
public static int m1(int n) {
	int count=0;
	for(int i=0;i<=n;i++) {
		n/=10;
		count++;
	}
	return count;
}
}
