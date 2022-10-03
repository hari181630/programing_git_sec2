package pkg1;

public class Collect {

	public static void main(String[] args) {
		Object o1[]=new Object[5];
		o1[0]="hari";
		o1[1]=123;
		o1[2]=new java.util.Date();
		o1[3]=new java.util.Date();
		for(Object o2:o1) {
			System.out.println(o2);
		}
	}

}
