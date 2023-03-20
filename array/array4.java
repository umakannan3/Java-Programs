import java.util.Scanner;
import java.util.Array;
class array4{
public static void main(String args[]){
	int e=0,o=0;
	Scanner s = new Scanner(System.in);
	int c[] = new int[10];
 	for(int i=0;i<c.length;i++){
		c[i] = s.nextInt();
	}
	for(int a : c){
		if(a%2 == 0){
		e++;
	}else{
		o++;
	}
	}
	System.out.println("even nos"+e);
	System.out.println("odd nos"+o);
	
}
}