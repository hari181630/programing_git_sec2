package pkg;

public class Method {

	
	public void m2() {
		System.out.println("hello");
	}
	public static void m3() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		Method  m1 = new Method();
		m1.m2();
		Method.m3();
		
	}
}
