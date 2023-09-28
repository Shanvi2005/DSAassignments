ackage Solutions;
import java.util.Scanner;

public class A1Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        scanner.close();
        for(int i=2; i<n; i++) {
            boolean PrimeNo = true;
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    PrimeNo = false;
                    break;
                }
            }
            if(PrimeNo) {
                System.out.print(i + " ");
            }
        }
    }

}
