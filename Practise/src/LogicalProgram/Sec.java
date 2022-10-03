package LogicalProgram;

public class Sec {

	public static void main(String[] args) {
		int a[]= {1,10,2,3,4
	};
	System.out.println("second largest"+
	Sec(a,5));
	
	}


	private static String Sec(int[] a, int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public static int arr(int a[],int total) {
		int temp;
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;i<=a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
		
	}
}
