package sankaj;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1="Hari Burewar";
		String x2="Paraji Burewar";
		String x3="hari Burewar";
		String x4="hari Burewar";
		System.out.println(x3.equals(x4));//true
		System.out.println(x1.equalsIgnoreCase(x4));//true
		System.out.println(x1.equalsIgnoreCase(x2));//false
		//

	}

}
