package pkg1;

public class Reverse_String {

	public static void main(String[] args) {
		
		String x2=" Hari burewar";
		
		//String c="";
		char y[]=x2.toCharArray();
		int size=x2.length();//
		char v[]=new char[size];
		int i=0;
		while(i!=size)
		{
			v[size-1-i]=y[i];
			i++;
		}
		System.out.println(v);
		

	}

}
