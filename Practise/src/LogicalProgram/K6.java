package LogicalProgram;

public class K6 {
public static void main(String[] args) {
	int s1=0,s2=1,s3,temp=10;
	System.out.println(s1+" "+s2);
	for(int i=2;i<=temp;i++) {
		s3=s1+s2;
		System.out.print(s3);
		s1=s2;
		s2=s3;
	}
	
}
}
