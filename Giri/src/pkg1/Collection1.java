package pkg1;

public class Collection1 {
	 public static void main(String x[])
     {
                 Object obj []=  new Object[5];
                   obj[0]="Ram";
                   obj[1]=5;
                   obj[2]=new java.util.Date();
                   obj[3]=false;
                   obj[4]=5.4f;
       for(int i=0; i<obj.length;i++)
         {
               System.out.println(obj[i]);
       }   
     }
}
