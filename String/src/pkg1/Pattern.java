package pkg1;

public class Pattern {
//	*
//	***
//	*****
//	*******

	public static void main(String[] args) {
		int star=10;
//		     float j = 13.4f;
//		     double y = 12;
//		     char z = ' ';
//		     String k="snonvdsnvos";
//		     int sd = 12;
//		     
				for(int i=0;i<=5;i++) {
					for(int j=1;j<=star;j++) {
						System.out.print("*");
					}
					System.out.println();
					star=star-2;
				}
	}

}
