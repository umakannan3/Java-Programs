import java.util.Scanner;
class Scan{
	public static void main(String []args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Simple Calculater");
	System.out.print("Enter A : ");
      int a = s.nextInt();
	System.out.print("Enter B : ");
      int b = s.nextInt();	
	System.out.println("Which calculation u need :");
	System.out.print("Add or Subtract: ");
	String str = s.next();
      switch (str)
		{
		case "+":
			if(a>0 && b>0)
				{
				int c = a+b;
				System.out.println("Addition value = " +c);				
				} 
			else{
				System.out.println("negative no not accepted");
			    }
			break;
		case "-":
			if(a>0 && b>0)
				{
				int c = a-b;
				System.out.println("Addition value = " +c);				
				} 
			else{
				System.out.println("negative no not accepted");
			    }
			break;
		default:
			    {System.out.println("only Add and sub accepted");}		
		}
       
	
}}