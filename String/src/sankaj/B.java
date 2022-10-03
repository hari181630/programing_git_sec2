package sankaj;

public class B {
public static void main(String[] args) {
	String s1 = new String("hello");
	String s2= new String("hello");
	String s3="Heloo";
	String s4="Heloo";
	B b=new B();
	B b1=new B();
	if(s1.equals(s2)) {
		System.out.println("Duplicate object strored in non constant area pool");
	}
	else
	{
		System.out.println("not duplicate object");
	}
	String s35="WelCome";
	System.out.println(s2.toUpperCase());
	System.out.println(s2);
	System.out.println(s3.charAt(3));
	for(int i=0;i<s3.charAt(i)/2;i++) {
		System.out.println(i);
	}
}
}
