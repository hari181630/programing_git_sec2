package LogicalProgram;

public class SecondLargest {
		public static int s(int a[],int total) {
			int temp;
			for(int i=0;i<=total;i++) {
				for(int j=i+1;i<=total;j++) {
					if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			return a[total-2];
			
			
		}
		public static void main(String[] args) {
			int a[]= {
					1,2,3,4,5,6
			};
			SecondLargest.s(a, 6);
		}
}
		
