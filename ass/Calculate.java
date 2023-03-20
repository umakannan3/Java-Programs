import java.util.*;
class Calculate
{
 
public static boolean isDivisible(int x[], int n)
{
    
      int lastDigit = x[n - 1] % 10;
      if (lastDigit == 0)
      	return true;
      else
      	return false;
}
 
public static void main ( String []arg)
{
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the range :");
	int z = s.nextInt();
      int x[] = new int[z];
	for(int i=0;i<z;i++){
		System.out.print("x["+i+"]"+":");
		x[i] = s.nextInt();
	}System.out.println(Arrays.toString(x));

      int n = x.length;
 
    if (isDivisible(x, n))
        System.out.println("Yes");
    else
        System.out.println("No");
}
}