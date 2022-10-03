package pkg1;

public class Method_Para {
	
	float m2(int x,int y)//non static with parameter and return type
	{
		
		int z=x+y;
	
		
		return z;
	}
	int m1(int y,int x)//non static method
	{
	int z1=x+y;
	return z1;
	
	}
	int m4(int s,int a2)
	{
		int s1=s+a2;
		return  s1;
	}
	public static void main(String[] args)
	{
		 Method_Para ref = new  Method_Para();
		
		int n1 = ref.m1(20,100);
		System.out.println(n1);
		ref.m4(45, 10);
		int f=ref.m4(12, 20);
		System.out.println(f);
		
		 
		 
	}
}
