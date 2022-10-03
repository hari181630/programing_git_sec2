import java.util.Scanner;

public class FactorialMethod{
public  static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("enter first Number:");
	int n=scn.nextInt();
	scn.close();
	FactorialMethod f = new FactorialMethod();
	int result=f.factorial(5);
	System.out.println(result);
	
	
}
int factorial(int n) {
	int fact=1;
	for(int i=2;i<=n;i++) {
		fact=fact*i;
		//System.out.println(fact);
	}
	return fact;
}
}
