package pkg3;

public class Feb11 {
static int x=10;
int y=100;
final int x10 = 0;
static void m1() {
	System.out.println();
	
	
	
}
public static final  void main(String[] args) {
	System.out.println(x);
	Feb11 f = new Feb11();
	System.out.println(f.x10);
}
//public final void main(String[] args) {
//	System.out.println(Feb11.x);
//	Feb11 f = new Feb11();
//	f.m2();
//}
 void m2() {
	System.out.println(y);
}
final void m3() {
		System.out.println(y);
		System.out.println(x);
	}
}
