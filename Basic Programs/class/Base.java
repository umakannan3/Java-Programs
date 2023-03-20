import java.util.*;
abstract class Sunstar
{
	abstract void printinfo();
}
class Employee extends Sunstar
{
	void printinfo()
	{
		String name = "Uma";
		int age = 37;
		String designation = "Java Developer";
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
		System.out.println("Designation : "+designation);
	}	
}
class Base
{
	public static void main(String args[])
	{
		Sunstar s = new Employee();
		s.printinfo();
	}
}