import java.util.*;
class Student
{
	private int rollno;
	private String name;
	private String result;
	public int getRollno()
	{
	return rollno;
	}
	public String getName()
	{
	return name;
	}
	public String getResult()
	{
	return result;
	}
	public void setRollno(int rno)
	{
	this.rollno=rno;
	}
	public void setName(String n)
	{
	this.name=n;
	}
	public void setResult(String r)
	{
	this.result=r;
	}
	}
	class Studentresult
	{
	public static void main(String[]args)
	{
	Student obj = new Student();
	obj.setRollno(01);
	obj.setName("Uma");
	obj.setResult("Pass with Distigtion");
	System.out.println("Name:"+obj.getName());
	System.out.println("Roll No:"+obj.getRollno());
	System.out.println("Result:"+obj.getResult());
	}
}