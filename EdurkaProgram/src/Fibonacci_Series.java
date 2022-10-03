import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner scn =new Scanner(System.in);
		System.out.println("how many fibonacci series number:");
		int num=scn.nextInt();
		scn.close();

	}
	public static void fabinacciSeries() {
		int x=0,y=0,z=0,Count=0;
		while(Count<=0) {
			System.out.println(z+"  ");
			z=x+y;
			x=y;
			y=z;
			Count++;
		}
	}

}
