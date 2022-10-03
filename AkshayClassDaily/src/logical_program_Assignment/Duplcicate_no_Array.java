package logical_program_Assignment;

public class Duplcicate_no_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,2,1};
		int size=arr.length;
		System.out.println(size);
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]!=arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}