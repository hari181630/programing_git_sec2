package loops;

public class Array2 {

	public static void main(String[] args) {
		int a[]= {0,91,2,5,94};
		int largeNo=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(largeNo>=a[i])
			{
				largeNo=a[i];
			}
		}
		System.out.println(largeNo);
	}
}
