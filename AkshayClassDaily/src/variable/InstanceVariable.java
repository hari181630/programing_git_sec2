package variable;

public class InstanceVariable {
		int x;//declare instance variable now its value is zero
		int y=2;//declare and initialise
		InstanceVariable(){
			 x=34;//we assign value in the instance variable
			
		}
		static public  void main(String[] args) {
			InstanceVariable i  = new InstanceVariable();
			//i.m1();
			System.out.println(i.x);
			System.out.println((i.x=66)+(i.x=36));//re- assign value in the main method
			i.m1();
			InstatnceLife i2 = new InstatnceLife();
			System.out.println(i2.y);
			
		}
		public void m1() {
			x=106;
			System.out.println(x);
		}
		//instance variable are not allowed in static method
		//static method and non-static method can not overload with same argument
		//its return type is independent in method overload
		public static void m1(int x) {
//			x=107;
//			System.out.println(x);
		}
		
}
