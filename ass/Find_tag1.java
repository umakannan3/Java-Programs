import java.util.Scanner;
class Find_tag1{
	public void get_str(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = s.nextLine();
		System.out.println(verify(str));
	}
	public String verify(String str){
		char[] ch = str.toCharArray();
			if(ch[2]!= 'A' || ch[2]!= 'E' || ch[2]!= 'I' || ch[2]!= 'O' || ch[2]!= 'U' || ch[2]!= 'Y' ||
			   (ch[4]+ch[5])%2 == 0 || (ch[5]+ch[6])%2 == 0 || (ch[7]+ch[8])%2 == 0){
				return("valid");
			}
			else{
				return("invalid");
			}
			
	}
	public static void main(String args[]){
		Find_tag1 ft = new Find_tag1();
		ft.get_str();
	}
}