import java.util.Scanner;

public class Table {
public static void main(String[] args) {

	Scanner scn =new Scanner(System.in);
	System.out.println("enter first Number:");
	int n=scn.nextInt();
	scn.close();
	int Table=tableAnyNumber(10);
	System.out.println(Table);
	
}
public static int tableAnyNumber(int n) {
	int total=0;
	for(int i=1;i<=n;i++) {
		//System.out.println(i*n);
		
		
		 total=i*n;
	}
	return total;
		
}
}
