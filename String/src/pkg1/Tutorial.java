package pkg1;

public class Tutorial {

	public static void main(String[] args) {
		int z1=100,z2=200;
		int v1 = Tutorial.m3(z1, z2);
		System.out.println(v1);
	}
	
	
	static int m3(int x1,int x2) {
		int result;
		if(x1>x2)
		result=x1;
		else
			result=x2;
		return 78;
	}

}
