import java.util.Scanner;

public class EX1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int N = input.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            sum += num;
        }
        
        System.out.println("The sum of the " + N + " numbers is: " + sum);
        
        input.close();
    }
}