package pkg1;

public class Fabonacci_series {

	public static void main(String[] args) {
		int firstterm=0,lastterm=1,n=10,nthterm;;
		System.out.println("fabonacci series"+n+"times execute");
		for(int i=0;i<=n;i++) {
			System.out.print(firstterm);
		nthterm=firstterm+lastterm;
		firstterm=lastterm;
		lastterm=nthterm;
		}
	}

}
