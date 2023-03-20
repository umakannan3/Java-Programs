import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Limit : ");
	int x = s.nextInt();
	int a = 0; int b = 1;
	System.out.print(a+" "+b);
	for(int i=3;i<=x;i++){
		int c = a+b;
		System.out.print(" "+c);
		a = b; b = c;
	}
		 
}
}