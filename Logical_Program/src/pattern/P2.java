package pattern;

public class P2 {
	//*
		//**
		//*
		//**
		//
		
		public static void main(String[] args)
		{
			int star=1;
			  //        5<=4    5
			for(int i=1; i<=4; i++)   //outer for loop for rows
			{				//5<=4     5
				for(int j=1; j<=star; j++)   //inner for loop for col
				{
					System.out.print("*");
				}
				System.out.println();
				star++;     //5
			}	
		}
}
