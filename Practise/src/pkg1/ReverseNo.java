package pkg1;

import java.util.Scanner;

public class ReverseNo {
public static void main(String[] args) {
Scanner Scn = new Scanner(System.in);
System.out.println("enter any nuber");
int number = Scn.nextInt();
int rem,rev=0;
for(int i=0;number!=0;i++) {
	rem=number%10;
	rev=rev*10+rem;
	number=number/10;
}
System.out.println(rev);


}
}
