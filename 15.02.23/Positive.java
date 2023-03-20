import java.util.*;
class Positive{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no : ");
		int x = s.nextInt();
		if(x>0){
			System.out.println(x + " is positive");
		}else{
			System.out.println(x + " is negative");
		}	

	}
}