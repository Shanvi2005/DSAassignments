package Solutions;
import java.util.*;

public class A1Q2
{
	
	public static void main(String[] args)
	{    
		System.out.print("Enter marks out of 100");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		if(n>90)
		{ System.out.print("grade is A");}
		if(n>80)
		{ System.out.print("grade is B");}
		if(n>70)
		{ System.out.print("grade is C");}
		if(n>60)
		{ System.out.print("grade is D");}
		if(n>50)
		{ System.out.print("grade is E");}
		if(n>40)
		{ System.out.print("grade is F");}
	}
		
}
