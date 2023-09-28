package Solutions;
import java.util.*;

public class A1Q10
{
	public static void main(String[]args)
	{
		Scanner scn = new Scanner(System.in);
		int a= scn.nextInt();
		
		for(int d=2;d*d<=a;d++)
		{
			while(a%d==0)
			{
				a=a/d;
				System.out.print(d+" ");
			}
		}
		
		if(a!=1)
		{
			System.out.print(a);
		}
		
	}
}
