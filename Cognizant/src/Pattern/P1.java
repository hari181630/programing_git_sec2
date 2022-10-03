package Pattern;

public class P1 {
//	*
//	**
//	***
//	****
//	*****


	public static void main(String[] args) {
	int	star =1;
	int space=3;
	for(int i=1;i<=5;i++) {
		for(int k=1;k<space;k++) {
			System.out.println(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		star=star+1;
		space=space--;
	}
	}

}
