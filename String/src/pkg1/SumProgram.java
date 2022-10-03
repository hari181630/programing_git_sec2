package pkg1;

public class SumProgram {
	int x=100;
	int y=2;

	public static void main(String[] args) {
		int x=100;//
		int X1 = 100;//
		System.out.println(x+X1);
		SumProgram s = new SumProgram();
		s.sub();
		s.mul();
	}
	void sub() {
		System.out.println(x-y);
	}
	void mul() {
	
		System.out.println(x*y);
	}

}
