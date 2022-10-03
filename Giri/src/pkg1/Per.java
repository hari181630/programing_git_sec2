package pkg1;

public class Per {
	int marks[],agg,per;
    void setMarks(int s1[])
    {
           marks=s1;
    }   
   void showPer()
   {
          for(int i=0;i<marks.length;i++)
          {
                    agg = agg+marks[i];
          }
         per=agg/marks.length;
  System.out.printf("Per is %d\n",per);
   } 
}
