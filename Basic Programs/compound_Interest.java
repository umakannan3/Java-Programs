import java.lang.*;
import java.util.*;
class CI{
		public void calculation()
		{
		
			float p=0, r=0 , n=0;
			float ci = p+r+n;
			//int ci = p*(((1+r)+n)-1);
			System.out.println("Compound Interest : "+p);
		}
}
class compound_Interest extends CI{
		

		public void getinputs()
		{
			Scanner s = new Scanner(System.in);

			System.out.println("Calculating Compound-Interest");
			System.out.println("-----------------------------");
			System.out.print("Principle Amount : ");
			float p = s.nextFloat();
			System.out.print("Rate of Interest : ");
			float r = s.nextFloat();
			System.out.print("Years : ");
			float n = s.nextFloat();
		}
}
		
}

Class Compound
{

		public static void main(String args[])
		{
			
			
			compund_Interest cint = new compound_Interest();
			cint.getinputs();
			cint.calculation(); 
		}
}
	
