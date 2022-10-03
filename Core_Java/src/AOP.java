
public class Arithmatic_operator {
	int x;
	 int y;
	Arithmatic_operator(){
		x=100;
		y=200;
	}
	
	
public static void main(String[] args) {
	
	
	System.out.println("Arithmatioc all operation below");
		
	Arithmatic_operator a = new Arithmatic_operator();
	a.operator();
	
	
	
}
public void operator() {
	
	System.out.println(x+y);
	System.out.println(y-x);
	System.out.println(x*y);
	System.out.println(y/x);
	System.out.println(x%y);
	//System.out.println(x+y);
	
}
public static void logical_Operator() {
	boolean x=true;
	boolean y=true;
	boolean z=false;
	boolean z1=false;
	
	if(x && y) {
	System.out.println("true");
	}
	else if(x || z1) {
		System.out.println("true");
	}
	else if(x != z) {
		System.out.println("false");
	}
	
	
	
}
}
