package String;

public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam";
		char y[]=s1.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(a[i]!=y[i])
			{
				System.out.println("not pallindrome");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
			}
		}
		System.out.println("pallindrome");

	}

}
