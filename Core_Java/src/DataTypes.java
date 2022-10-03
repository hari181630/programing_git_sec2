
public class DataTypes {
	byte size1= 1;//default value 0
	short size2=2;//default value 0
	int size3=4;//default value 0
	long size4=8;//default value 0
	float size5;//default value is 0
	double size6;//default value is 0
	char size7='2';//default value is char \u0000
	boolean size8;//its default value false
	//all above are PDT and size fixed
	//all are keyword
	String x="hari Burewar";//string literal stored in non-constant pool
	//its Non-PDT,size vary,its identifier its having own object
	int x123[]= {1,23,345,9};
	int x322[]=new int[100];
	String x23= new String("Hari Burewar");//constant pool area
	
	
	
	
	
public static void main(String[] args) {
	System.out.println("Data types default value");
	DataTypes  d = new DataTypes();
System.out.println(d.size5);//it takes 6 decimal and its value end with f symbl	
System.out.println(d.size6);//it takes 8 value and its value end with nothing
System.out.println(d.size7);
System.out.println(d.size8);
}
}
