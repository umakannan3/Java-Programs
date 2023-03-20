import java.util.Scanner;
class calculate_string{
	public void read_str(){
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = s.nextLine();
		System.out.println("no of words in Sentence : "+countwords(str));
		System.out.println("no of words in Characters : "+countchar(str));
	}
	public int countwords(String str){
		String b[] = str.split(" ");
		return(b.length);
	}
	public int countchar(String str){
		char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
            	String s = "";
            	while (i < ch.length && ch[i] != ' ') {
               	 count = count + ch[i];
               	 i++;
           	      }
		}
		return(count);
	}
	public static void main(String args[]){
		calculate_string calstr = new calculate_string();
		calstr.read_str(); 
	}
}