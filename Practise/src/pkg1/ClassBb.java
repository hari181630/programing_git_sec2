package pkg1;

public class ClassBb extends ClassAa{
	String e="child class ";
public static void main(String[] args) {
	ClassBb b = new ClassBb();
	b.m3();
	
}
public void m3() {
	//e is the same variable name in both classes,calling variable from super class i want 
	//print
	System.out.println(super.e);
}
}
