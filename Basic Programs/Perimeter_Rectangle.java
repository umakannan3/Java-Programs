import java.lang.*;
import java.util.*;
public class Perimeter_Rectangle{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Perimeter of Rectangle");
		System.out.println("----------------------");
		System.out.print("Length : ");
		int l = s.nextInt();
		System.out.print("Breath : ");
		int b = s.nextInt();
		int perimeter = 2*(l+b);
		System.out.println("Perimeter : "+perimeter);
		
}}