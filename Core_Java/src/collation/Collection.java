package collation;

import java.util.ArrayList;

public class Collection {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Hari");
	al.add(23);
	al.add('H');
	al.add(23.3);
	al.add(null);
	al.add(null);
	al.add(null);
	System.out.println(al);
	//arraylist
	//1.duplicate allow 
	//2.multiple null value allow
	//3.insertion order :maintain
	//Ds:resizible
	//index type:index
	//best choice for retrieve data
	//worst choice for insertion data
	//note:when duplicate allow and insertion order maintain:use scenario
}
}
