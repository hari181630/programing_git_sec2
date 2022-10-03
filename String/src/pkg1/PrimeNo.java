package pkg1;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%2==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime no");
		}

	}

}
