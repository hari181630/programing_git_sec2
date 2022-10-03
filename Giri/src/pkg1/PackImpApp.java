package pkg1;

import java.util.Scanner;

public class PackImpApp {

	public static void main(String[] args) {

		Scanner xyz = new Scanner(System.in);//step2            
		System.out.println("Enter the name");
		String name=xyz.nextLine(); //step3
		System.out.println("Enter the id");
		int id=xyz.nextInt();
		System.out.println("Enter the per");
		float per=xyz.nextFloat();

		System.out.printf("Name is %s\n",name);
		System.out.printf("Id is %d\n",id);
		System.out.printf("Per is %f\n",per);
		//System.out.println("name"+name+"Id"+id+"percentage"+per+"it do not support ");

	}

}
