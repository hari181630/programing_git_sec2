package pkg1;

public class CountSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc   b o";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			char b =str.charAt(i);
			if(b==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
