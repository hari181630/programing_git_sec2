package pkg1;

public class MoreProgramIn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10);
		int n1=5;
		for(int i=1;i<=10;i++) {
			System.out.println(i*n1);
		}
	}
	public static void sum(int n) {
		int sum=0;
//		for(int i=0;i<=n;i++) {
//			sum=sum+i;
//		}
		System.out.println(sum);
		for(int j=0;j<=n;j++) {
			if(j%2==1) {
				sum=sum+j;
			}
		}
		System.out.println(sum);
	}

}
