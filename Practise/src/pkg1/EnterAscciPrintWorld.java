package pkg1;

public class EnterAscciPrintWorld {
static void printValue(char digit) {
	switch(digit) {
	case '0':
		System.out.print("Zero");
		break;
	case '1':
		System.out.print("one");
		break;
	case '2':
		System.out.print("two");
		break;
	case '3':
		System.out.print("three");
		break;
	case '4':
		System.out.print("four");
		break;
	case '5':
		System.out.print("five");
		break;
	case '6':
		System.out.print("six");
		break;
	case '7':
		System.out.print("seven");
		break;
	case '8':
		System.out.print("eight");
		break;
	case '9':
		System.out.print("nine");
		break;
		
	}
}
static void printWord(String N) {
	int i,length=N.length();
	for(int i1=0;i1<N.length();i1++) {
		printValue(N.charAt(i1));
	}
}
public static void main(String[] args) {
	String N="1350";
	printWord(N);
}
}
