package pkg1;

public class Student{
private String pname;
private int id;
private int age;
private int std;
public int setId(int id) {
	this.id=id;
	//this"(this is current student object ) to allow for further chained method calls
	return 5;
}
public int setAge(int age) {
	this.age=age;
	//this"(this is current student object ) to allow for further chained method calls
	return 7;
}
public int setPname(String pname) {
	this.pname=pname;
	//this"(this is current student object ) to allow for further chained method calls
	return 78;
}
public int setStd(int std) {
	this.std=std;
	return 78;
}
public void show() {
	System.out.println("Student Detail information");
	//String name = null;
	//String \nname;
	//method chaining
	//String name;
	//System.out.println("id "+id+" name student = "+name+" student age\n "+age+"Student standard\n "+std);
	System.out.println("id:"+id+"\nName:"+pname+"\nAge: "+age+"\nStandard:"+std);
}
public static void main(String[] args) {
	System.out.println("enter student inforamation");
	Student s = new Student();
	//s.setId(1).setPname("hari").setAge(25).setStd(20).show();
	 
}


}
