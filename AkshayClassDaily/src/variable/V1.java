package variable;
//here in that program we check default value char ,static variable re-assign or not //and instance variable how to re-assigned
public class V1 {
	final int x56 = 234;//final variable can not modifield ones we assign value in final variable
	//or we can also says it cannot reassign value in that variable lets check
	//here we get error is  cannot make static reference to the non-static field x56
	//simple word non-static variable 
	
	int x=23;
	int y;
	char z2;//character default value is ****space****
	static int z;
	static int z1=44;//static variable allocate memory once but it should re-assign value
	//x=232;
	//it is declare variable means its allocate to memory and its default value is zero now
	public static void main(String[] args) {
	final int	x57=32445;
	final int x59;//we declare only final variable but that variable dont have default value
	x59=78;
	System.out.println(x59);
	//x59=1230;
	//System.out.println(x59);
	System.out.println(x57);
		System.out.println(z1+x57);
		int  x;//variable decleration
			x=56;//variable initialisation
			float x2=6.08f;//Declaration and initialisatin variable in single line
			System.out.println(x);
			System.out.println(z1+x);
			x=237;//re-assign value or reinialised value 
			System.out.println(x);
			V1 v = new V1();
			double s = 0;//local variable dont have default value;
			System.out.println(s);
			System.out.println(z1=34);
			System.out.println(z1+x2);
			System.out.println(v.z2);
			System.out.println(v.z2);
			System.out.println(v.z2);
			//System.out.println((v.x=234) + (v.y=66));
			System.out.println(z);
	}
	
}
