import java.util.Scanner;
import java.util.Arrays;
class Largestno{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter a["+i+"] : ");
			a[i] = s.nextInt();
		}
		System.out.println("Your Array");
		for(int j=0;j<n;j++){
			System.out.print(a[j] +",");
		}
		System.out.println();	
		Arrays.sort(a);
		System.out.println("Minimum value : "+a[0]);
		System.out.println("2nd Minimum value : "+a[1]);
		System.out.println("Maximum value : "+(a[a.length-1]));
		System.out.println("Maximum value : "+(a[a.length-2]));			
}
}