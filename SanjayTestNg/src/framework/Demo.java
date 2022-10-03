package framework;

public class Demo {
	// global variable
private int num1;
private int num2;
	//initialised all global variable in parametrised constructor
public Demo(int a,int b)
{
	this.num1=a;
	this.num2=b;
}
public void add()
{
	System.out.println(num1+num2);
}
public void mul()
{
	System.out.println(num1*num2);
}
public void sub()
{
	System.out.println(num1-num2);
}
}
