package pkg1;

public class example4_Reverse_String {
public static void main(String[] args) {
	String org="abcd";//
	String rev="";//         3>=0 //2
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+ org.charAt(i);//""+d=d+c=dc
	}
	System.out.println(rev);
}
}
