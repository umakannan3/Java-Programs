import java.util.Scanner;
import java.util.Arrays;
class bucket{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int c[] = new int[10];
		for(int i=0;i<c.length;i++){
			c[i] = s.nextInt();	
			
		}
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		System.out.print("enter the new volume:");
		int x = s.nextInt();
		c[0]=c[0]+x; 
		System.out.println(Arrays.toString(c));
  
}
		
}
