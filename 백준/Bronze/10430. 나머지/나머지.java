import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        
        int result1 = (A + B) % C;
        int result2 = ((A % C) + (B % C)) % C;
        int result3 = (A * B) % C;
        int result4 = ((A % C) * (B % C)) % C;


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}