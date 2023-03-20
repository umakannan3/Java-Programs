import java.util.Scanner;
class multy{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int c[]= {1,2,3,4,5,6,7,8,9};
		int temp = 1;
		System.out.println("column no :");
		int x = s.nextInt();
		for(int i=0;i<c.length;i++){
			if ( x==temp )
			{
				System.out.print( c[i]);
				System.out.println();
				temp = 1;
			}
			else
			{
				System.out.print(c[i]);
				temp++;
			}
		}
	}
}