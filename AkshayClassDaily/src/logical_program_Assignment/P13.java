package logical_program_Assignment;

public class P13 {

	public static void main(String[] args) {
		int rem,num=1234,sum=0;
		int i=0;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
