
public class Variable {
	int x=100;
	
//global variable ,default 0 ,stored heap,memory allocate run time,scope whole program,its need object to call
	static int y=100;
final int var = 0;

//private char[] x3;

//private char[] x3;
	
public static void main(String[] args) {
	int x=1000;//local variable,static block,allocate at the time of object, need to call object scope is within block
	final int variable=10;
	final int x3=90;
	Variable v = new Variable();
	System.out.println(x3);
	System.out.println(y);
	System.out.println("instance variable:"+x);
	System.out.println(" variable:"+x);
	System.out.println(x);
	
}
}
