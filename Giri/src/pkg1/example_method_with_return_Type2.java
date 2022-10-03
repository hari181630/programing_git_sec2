package pkg1;

public class example_method_with_return_Type2 {
	public static String covertStringToUpperCase(String str)
	{
		String str1 = str.toUpperCase();
		return str1;
	}
	public static int findLengthOfString(String str)
	{
		int size = str.length();
		return size;
	}
	public static void main(String[] args) {
		String s1="velocity";
		
		int size1 = findLengthOfString(s1);
		System.out.println(size1);	
		
		String s2 = covertStringToUpperCase(s1);
		System.out.println(s2);
	}
}
