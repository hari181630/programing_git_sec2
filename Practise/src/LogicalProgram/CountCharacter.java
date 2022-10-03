package LogicalProgram;

public class CountCharacter {
public static void main(String[] args) {
	int count=0;
	int i=0;
	String x1="Hari Burewar";
	x1=x1.concat("\0");
	char y[]=x1.toCharArray();
	while(y[i]!='\0') {
		count++;
		i++;
	}
	System.out.println(i);
}
}
