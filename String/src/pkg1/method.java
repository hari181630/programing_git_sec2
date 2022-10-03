package pkg1;

public class method {
	int x=39;
	//int l=m1();

	void m1()//non-static method
	{
		System.out.println("hello");
	
	}
	static void m2()//static method
	{
		System.out.println("hwllll");
	}
	
	void m23()//non-static method
	{
		System.out.println("lo");
	}
	static String v="hari";
	
	public static void main(String[] args) {
		method ref = new method();//object
		ref.m1();//hello
		System.out.println("ky print hoil");//print
		ref.m1();//hello
		ref.m23();
		method.m2();
		System.out.println(ref.x);
		System.out.println(method.v);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
