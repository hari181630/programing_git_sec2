
public class SuperCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c =new CC();
	}

}
class PC
{
    PC()
   {
       System.out.println("I am parent constructor");
   }
}
class CC extends PC
{
     CC()
    {
         System.out.println("I am child constructor");
    }
}
