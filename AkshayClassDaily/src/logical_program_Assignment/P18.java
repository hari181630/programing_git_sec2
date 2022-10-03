package logical_program_Assignment;

import java.util.Arrays;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {
				1,2,3,4,5
		};
		for(int i=0;i<((x.length)/2);i++) {
			int h=x[(x.length-1)-i];
			x[(x.length-1)-i]=x[i];
			x[i]=h;
		}
		System.out.println("reverse array"+Arrays.toString(x));

	}
	
}
