package logical_program_Assignment;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,num=154,sum=0,temp=0;
		int i=0;
		temp=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("arm"+sum);
		}
		else
		{
			System.out.println("not arm"+sum);
		}
	}

}
