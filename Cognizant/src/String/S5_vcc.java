package String;

public class S5_vcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" a am india country";
		char y[]=s1.toCharArray();
		int size=y.length;
		int v=0;
		int c=0;
		int n=0;
		int i=0;
		while(i!=size) {
			if(y[i]>='a' && y[i]<='z')
			{
				if(y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
			else
			{
				n++;
			}
			i++;
		}
		System.out.println(v);
		System.out.println(n);
		System.out.println(c);
	}

}
