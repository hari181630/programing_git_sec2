package loops;

public class Arrays1 {

	public static void main(String[] args) {
		int a[]= {7,91,2,5,90};
		int smallNo=a[0];
		for(int i=0;i<a.length;i++) {
			if(smallNo>a[i])
			{
				smallNo=a[i];
			}
		}
		System.out.println(smallNo);
	}

}
