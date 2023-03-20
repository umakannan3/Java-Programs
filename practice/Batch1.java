import java.util.Scanner;
class Student13
{
	String name; int age; int assesment_mark;
	
	void display()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = s.next();
		switch (name)
			case "arun":
				System.out.println("Name : Arun,Age : 32,Grade A");
				break;
			case "antony":
				System.out.println("Name : Antony,Age : 25,Grade B");
				break;
			case "sumathi":
				System.out.println("Name : Sumathi,Age : 35,Grade C");
				break;
			case "malar":
				System.out.println("Name : Malar,Age : 23,Grade D");
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
	System.out.println("INR 40,000");
	}
}
class Batch1{
	public static void main(String args[]){
	Webdevelopment w = new Webdevelopment();
	w.display();
	w.jobrole();
	w.salary();
}}
}
