package Solutions;
import java.util.*;

public class A1Q9
{
	public static void main(String[]args)
	{
		Scanner scn = new Scanner(System.in);
		int a= scn.nextInt();
		int b= scn.nextInt();
		
		int c = a;
		int d = b;
		
		while(a%b!=0)
		{
			int r=a%b;
			a=b;
			b=r;
			
		}
		int gcd = b;
		int lcm = (c*d)/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		
	}
}
