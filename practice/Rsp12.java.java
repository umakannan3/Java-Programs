import java.util.Scanner;
class Student13
{
	String name; int age; int assesment mark;
	
	void display()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = s.next();
		switch (arun)
			case "arun":
				System.out.println("Name : Arun,"+\n+"Age : 32"+\n+"Grade A");
				break;
			case "antony":
				System.out.println("Name : Antony,"+\n+"Age : 25"+\n+"Grade B");
				break;
			case "sumathi":
				System.out.println("Name : Sumathi,"+\n+"Age : 35"+\n+"Grade C");
				break;
			case "malar":
				System.out.println("Name : Malar,"+\n+"Age : 23"+\n+"Grade D");
				break;
			default:
				Sysem.out.println("File does not exist");
	}
}
class fullstack extends Students13{
	void jobrole()
	{
	System.out.println("Software Developer");
	}
}
class Webdevelopment extents fullstack{
	void salary(){
	{
	System.out.println("INR 40,000");
	}
}
class Rsp12{
	public static void main(String args[]){
	Webdevelopment w = new Webdevelopment;
	w.display();
	w.jobrole();
	w.salary();
}}
