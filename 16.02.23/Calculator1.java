import java.util.Scanner;
interface Arithmatic{
	public void Addition();
	public void Subtraction();
	public void Multiplication();
	public void Division();
	public void Modulus();
}

class Calculator1 implements Arithmatic{
	Scanner s = new Scanner(System.in);
	int a,b,c;
	public void Addition(){
		System.out.println("Addition : ");
		System.out.println("----------");
		System.out.print("Enter A : ");
		a = s.nextInt();
		System.out.print("Enter B : ");
		b = s.nextInt();
		c = a+b;
		System.out.println("Answer : "+c);
	}

	public void Subtraction(){
		System.out.println(" Subtraction : ");
		System.out.println("-------------");
		System.out.print("Enter A : ");
		a = s.nextInt();
		System.out.print("Enter B : ");
		b = s.nextInt();
		c = a-b;
		System.out.println("Answer : "+c);	
	}
	
	public void Multiplication(){
		System.out.println("Multiplication : ");
		System.out.println("----------------");
		System.out.print("Enter A : ");
		a = s.nextInt();
		System.out.print("Enter B : ");
		b = s.nextInt();
		c = a*b;
		System.out.println("Answer : "+c);
	}

	public void Division(){
		System.out.println("Division : ");
		System.out.println("----------");
		System.out.print("Enter A : ");
		a = s.nextInt();
		System.out.print("Enter B : ");
		b = s.nextInt();
		c = a/b;
		System.out.println("Answer : "+c);
	}

	public void Modulus(){
		System.out.println("Modulus : ");
		System.out.println("---------");
		System.out.print("Enter A : ");
		a = s.nextInt();
		System.out.print("Enter B : ");
		b = s.nextInt();
		c = a%b;
		System.out.println("Answer : "+c);
	}
	public static void main(String args[]){
		Calculator1 c = new Calculator1();
		c.Addition();
		c.Subtraction();
		c.Multiplication();
		c.Division();
		c.Modulus();
	}
}
	 
	