package logical_program_Assignment;

public class String_Array_Duplicate {
public static void main(String[] args) {
	String arr[]= { "Akshay","gayatri","Akash","Nikita","rahul","Nikita","gayatri"
			
	};
	int size=arr.length;
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
			}
			
		}
	}
}
}
