package pkg;

public class variable {

	
	static int x;//global variable//instance variable
	static int c=1012;
	variable(){
		x=10;
	}
	void variable1() {
		
	}
	
	public static void main(String[] args) {
		int y=10;//local
		System.out.println(x);
		Method v1= new Method();
		v1.m2();
		Method.m3();
		
	}
	 static void variable(){
	 int z=10;
	}
	void m1() {
		int z1=100;
	}
	static {
		int x=10;
	}
}
