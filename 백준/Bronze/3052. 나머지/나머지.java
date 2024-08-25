import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean[] remainders = new boolean[42];
        int count = 0;
        
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int remainder = number % 42;
            
            if (!remainders[remainder]) {
                remainders[remainder] = true;
                count++;
            }
        }
        
        System.out.println(count);
    }
}
