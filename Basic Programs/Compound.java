import java.lang.*;
import java.util.*;
class CI{
		void calculation(float p,float r, float n){
		/*float p, r, n;*/
		float ci = p*(((1+r)+n)-1);
		System.out.println("Compound Interest : "+ci);
	}
}
class compound_Interest extends CI{
			void getinputs(){
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
public class Compound{
		public static void main(String args[]){
			compound_Interest cint = new compound_Interest();
			cint.getinputs();
			cint.calculation(1000,9,6); 
		}
}
	
