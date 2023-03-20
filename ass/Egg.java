import java.util.Scanner;
public class Egg { 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter X and Y letters, that denote the number of Es and Gs respectively: ");
		String str = s.nextLine();
	
		String[] Numbers = str.split(" ");
		int x = Numbers[0];
		int y = Numbers[1];
		if (2 * x == y) {
			System.out.println("The entered word is similar to word EGG.");
		} else {
			System.out.println("The entered word is not similar to word EGG.");
		}
	}
}