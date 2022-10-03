package jdbc1111;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=0;
			int c=a/b;
			
		}

	catch(ArithmeticException e) {
		System.out.println(e.getMessage()+"Ocuured , please check your code");
	}
		System.out.println("very important code");
	}
}


