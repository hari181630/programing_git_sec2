package pkg1;

import java.util.Arrays;

public class example2_compare_2_int_Array {

	public static void main(String[] args) {
		int arr1[]= {10,20,30};
		int arr2[]= {40,50,60};
		int arr3[]= {40,50,60};
		System.out.println(Arrays.equals(arr1, arr2));//false
		System.out.println(Arrays.equals(arr3, arr2));//true
		System.out.println(Arrays.equals(arr1, arr3));//false
		
		

	}

}
