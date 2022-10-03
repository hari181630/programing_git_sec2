package pkg1;

public class FirstProgram {
	int x=100;
public static void main(String[] args) {
	FirstProgram f = new FirstProgram();//object
	f.m1();
	f.m1();
	f.m1();
	System.out.println("global variable");
	System.out.println("hello");
	
	
}
void m1() {
	int x=19;
	int c=19;

			System.out.println(x+c);
}
}



