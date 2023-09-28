package Solutions;
import java.util.*;

public class A1Q5
{
	public static void main(String[]args)
	{
		System.out.print("Enter a number");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i=0;
		
	    while (n>0)
	{
		n=n/10;
		i=i+1;
				
	}
	
	   System.out.print("The number has"+i+"digits");
	   
	
	
	}	
}
