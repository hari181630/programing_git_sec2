import java.util.Scanner;

public class DifferentLoop {
public static void main(String[] args) {

	Scanner scn =new Scanner(System.in);
	System.out.println("enter factorial Number:");
	int n=scn.nextInt();
	scn.close();
	int result=m1(5);
	System.out.println(result);
}
public static int m1(int n) {
	int fact=1;
	while(n!=0) {
		fact=fact*n;
		n--;
	}
	//System.out.println(f);
	return fact;
}
}
