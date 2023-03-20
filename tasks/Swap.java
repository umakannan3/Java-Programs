import java.util.Scanner;
class Swap{
	public static void main(String args[]){
	Scanner n = new Scanner(System.in);
	System.out.println("Swapping 2 nos");
	System.out.println("```````````````");
	System.out.print("Enter the value of A :");
	int a = n.nextInt();
	System.out.print("Enter the value of B :");
	int b = n.nextInt();
	System.out.println("Before Swapping :" +a+","+" "+b);
	int c = a; a = b; b=c;  
	System.out.println("After swapping :" +a+","+" " +b);
	

	


}
}