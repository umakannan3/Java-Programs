import java.util.Scanner;
class Multiple{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the table no : ");
		int n = s.nextInt();
		for(int i=1;i<=16;i++){
			System.out.println(i+"*"+n+"="+(i*n));
		}
		
	}

}