import java.util.Scanner;
class Calculate_nos{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int count=0;
		System.out.print("Enter l: ");
		int l = s.nextInt();
		System.out.print("Enter r: ");
		int r = s.nextInt();
		System.out.print("Enter k: ");
		int k = s.nextInt();
		if(l<=1000 && r<=1000 && k<=1000){
			for(int i=0;i<=r;i++){
				if(i%k ==0){
  					count++;}
			}System.out.println("the count is : "+count);
			
		}else {System.out.println("Enter the value between 1 to 1000");}
	}
}