package pkg1;

public class EvenNodd {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=100) {
//			if(i%2==0) {
//				System.out.print(i);
//				//System.out.println("even no");
//			}
//			else
//			{	//System.out.println("odd no");
//				System.out.println(i);
//			}
//			i++;
//		}
		oddN();
	}
	public static void oddN() {
		int i=0;
		while(i<=100) {
			if(i%2==1) {
				System.out.print(i);
			}
			i++;
		}
		
	}

}
