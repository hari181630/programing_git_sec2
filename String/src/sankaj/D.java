package sankaj;

public class D {
public static void main(String[] args) {
	String s11="Burewar";
	String s13="i am attend java classes daily.java is easy but you need practise daily";
	System.out.println(s11.lastIndexOf('r'));
	System.out.println(s11.indexOf("war"));
	String s12="ababab";
	String s15="war";
	System.out.println(s12.stripIndent());
	System.out.println(s12.indexOf('A'));
	System.out.println(s13.replace("java", "selenium"));
	System.out.println(s13.replace("java", "C"));
	System.out.println(s13.replaceAll(s11, s13));
	System.out.println(s11.replaceFirst(s12, s13));
	System.out.println(s11.substring(4));
	System.out.println(s11.substring(4,7));
	System.out.println(s13.length());
	System.out.println(s11.toCharArray());
//	for(int i=0;i<"Burewar";i++) {
	System.out.println(s11.compareTo(s15));
//		
//	}
}
}
