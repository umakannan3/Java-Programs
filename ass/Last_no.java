import java.util.Scanner;
import java.util.Arrays;
class Last_no{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size :");
		int z = s.nextInt();
		int x[] = new int[z];
		for(int i=0;i<z;i++){
			x[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(x));
		StringBuilder sb = new StringBuilder(); 
		for (int i = 0; i < x.length; i++) {
    			int lastDigit = x[i] % 10; 
    			sb.append(lastDigit);
		}

		int lastDigitNumber = Integer.parseInt(sb.toString());
		boolean isDivisibleByTen = (lastDigitNumber % 10 == 0);

		if (isDivisibleByTen) {
    			System.out.println("The number is divisible by 10");
		} else {
   		      System.out.println("The number is not divisible by 10");
		}
	}
}