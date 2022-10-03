package pkg1;

public class Rev_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1234;
		int sum=0,rem,temp=0;
		while(x!=0) {
			
			rem=x%10;
			sum=sum*10+rem;
			x=x/10;
		}
		System.out.println(sum);
	}

}
