package String;

public class S3_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mom wow";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		//System.out.println(s2);
		if(s2.equalsIgnoreCase(s1))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindeome");
		}

	}

}
