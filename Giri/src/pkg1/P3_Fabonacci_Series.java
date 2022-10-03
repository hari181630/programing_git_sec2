package pkg1;

public class P3_Fabonacci_Series {
	

	public static void main(String[] args) {
	int ft=0,lt=1,n=10,ntt;
	System.out.println("fabonacci series is print upto"+n);
	for(int i=0;i<=n;i++) {
		System.out.println(ft);
		ntt=lt+ft;
		//System.out.println(lt);
		ft=lt;
		lt=ntt;
	}
	//System.out.println();
		
		
	}

}
