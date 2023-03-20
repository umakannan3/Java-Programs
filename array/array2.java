import java.util.Scanner;
class array2{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int b[] = new int[4];
	//b[]={10,20,30,40,50};
	for(int i=0;i<b.length;i++){
	int x = s.nextInt();
	b[i] = x;
}
	for(int a : b){
		System.out.println(a);
}
}
}