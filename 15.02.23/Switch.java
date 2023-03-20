import java.util.*;
public class Switch
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
switch(number)
{
case 1:
if(number==1)
{
System.out.println("one");
}
break;
case 2:System.out.println("two");
break;
case 3:System.out.println("three");
break;
default:System.out.println("Not one two three");
break;
}
}
}