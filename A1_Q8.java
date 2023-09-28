package Solutions;
import java.util.*;
public class A1Q8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();

		int numLen = (int) (Math.log10(x) + 1); // finding the length of the number
		y = y % numLen;
		if (y < 0)
			y = y + numLen;

		int d = (int) Math.pow(10, numLen - y); // calculating the divisor 
		int m = (int) Math.pow(10, y); // calculating the multiplier

		int rotNum = ((x % d) * m) + (x / d); // rotating the number

		System.out.print(rotNum);
	}
}
