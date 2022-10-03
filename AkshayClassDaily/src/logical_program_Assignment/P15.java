package logical_program_Assignment;

public class P15 {

	public static void main(String[] args) {
		int rem,num=124,sum=0;
		int i=0;
		int temp=0;
		temp=num;
		while(num!=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("pallindrome"+sum);
		}
		else
		{
			System.out.println("not pallindrome"+sum);
		}
	

	}

}
