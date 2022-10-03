package akshay;

public class Duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {11,13,1,15,13};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j])
				{
					System.out.println(x[j]);
				}
			}
		}
	}

}
