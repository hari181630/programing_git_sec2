
package stringMethod;

import java.util.Arrays;

public class Strin {
public static void main(String[] args) {
	String a ="i am Hari Burewar";
	String [] k=a.split("Hari");
	String l =(a.split(" "))[0];
	System.out.println(Arrays.toString(k));
	System.out.println(l);
}
}
