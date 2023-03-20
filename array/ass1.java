import java.util.Scanner;
class calculate_string{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = s.nextLine();
		System.out.println("no of words in Sentence : "+countwords(str));
	public int countwords(String str){
		String b[] = str.split(" ");
		return(b.length);
	}
}
}
}