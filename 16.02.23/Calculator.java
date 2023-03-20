import java.util.Scanner;

class Calculator{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	double a,b,c;
	System.out.println("Simple Calculator");
	System.out.println("~~~~~~~~~~~~~~~~~");
	System.out.print("Enter A : ");
	a = s.nextDouble();
	System.out.print("Enter B : ");
	b = s.nextDouble();
	
	System.out.println("+"+"  "+"Addition");
	System.out.println("-"+"  "+"Subtraction");
	System.out.println("*"+"  "+"Multiplication");
	System.out.println("/"+"  "+"Division");
	System.out.println("%"+"  "+"Modulus");
	System.out.print("Choose Arithmatic Operation : ");
	char n = s.next().charAt(0);
	switch(n)
		{
		case '+':
			c = a+b;
			System.out.println("Addition : ");
			System.out.println("**********");
			System.out.println(a+""+"+"+b+""+"="+c );
			break;		
		case '-':
			c = a-b;
			System.out.println("Subtraction : ");
			System.out.println("***********");

			System.out.println(a+""+"-"+b+""+"="+c );		
			break;
		case '*':
			c = a*b;
			System.out.println("Multiplication : ");
			System.out.println("**************");

			System.out.println(a+""+"*"+b+""+"="+c );
			break;		
		case '/':
			c = a/b;
			System.out.println("Division : ");
			System.out.println("********");

			System.out.println(a+""+"/"+b+""+"="+c );
			break;
		case '%':
			c = a%b;
			System.out.println("Modulus : ");
			System.out.println("*******");

			System.out.println(a+""+"%"+b+""+"="+c );		
			break;
		default:
			System.out.println("no's are not valid");
		}


}
}