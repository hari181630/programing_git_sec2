package pkg1;

public class CountCharacter {
public static void main(String[] args) {
	String x1="Hari Burewar";
	int count=0;
	for(int i=0;i<x1.length();i++) {
		if(x1.charAt(i)!=' '){
			count++;
		}
	}
	System.out.println(count);
}
}
