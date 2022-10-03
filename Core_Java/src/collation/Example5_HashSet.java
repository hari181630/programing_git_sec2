package collation;

import java.util.HashSet;

public class Example5_HashSet {
public static void main(String[] args) {
	HashSet lh = new HashSet();
	lh.add("Hari");//all types of data are  stored
	lh.add('H');
	lh.add(45);
	lh.add(45.123f);
	lh.add("Burewar");
	lh.add(null);
	lh.add(null);
	lh.add(null);
	System.out.println(lh);
	System.out.println(lh);
}
}
