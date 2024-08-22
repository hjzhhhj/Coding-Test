import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int min = sc.nextInt();
        int max = min;
        
        for (int i = 1; i < N; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println(min + " " + max);
    }
}
