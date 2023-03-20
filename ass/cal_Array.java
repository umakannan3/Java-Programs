import java.util.Scanner;
import java.util.Arrays;
class cal_Array{
	public void get_arr(){
	StringBuilder sb = new StringBuilder();
	int rem=1, sum=0;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Size :");
	int z = s.nextInt();
	int x[] = new int[z];
	for(int i=0;i<z;i++){
		x[i] = s.nextInt();
	}
	System.out.println(Arrays.toString(x));
	for(int j=0;j<z;j++){
		int a = x[j];
		rem = a % 10;
		String no = sb.append(String(rem));
	}System.out.println(no);
	
	}
	public static void main(String args[]){
	cal_Array a = new cal_Array();
	a.get_arr();
	}
}
