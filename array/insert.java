import java.util.Arrays;
class insert{
	public static void main(String args[]){
	int c[] = {10,20,30,40,50,60,70,80,90,100};
	int index = 3;
	int value = 77;
	System.out.println("Before Inserting" +Arrays.toString(c));
	for(int i=c.length-1;i>index;i--){
		c[i] = c[i-1]; 
	}
	c[index] = value;
	System.out.println("After inserting" +Arrays.toString(c));	 
}
}