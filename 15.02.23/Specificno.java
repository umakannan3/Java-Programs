import java.util.*;
public class Specificno
{
public static void main(String[]args)
{
int a[] = {1,2,3,4,5,6,7,8,9,10};
Scanner obj = new Scanner(System.in);
System.out.print("Enter the number:");
int x = obj.nextInt();
for(int i:a)
{
if(i==x)
{
System.out.println("Contains");
}
}
}
}