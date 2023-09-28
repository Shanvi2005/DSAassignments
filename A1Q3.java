package Solutions;
import java.util.*;

public class A1Q3{
	
	public static void main(String[] args)
	{
		System.out.print("Enter a number");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i = 1;
		int s=0;
		while (i<=n){
		    if (n%i==0) 
		    {s=s+i;}
		    i=i+1;
	}
		if (s==n+1)
		{
			System.out.print("This is a prime number");
		}
}
}
