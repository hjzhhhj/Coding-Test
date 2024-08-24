import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), M = sc.nextInt();
        int[] baskets = new int[N];
        
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
            for (int index = i - 1; index < j; index++) {
                baskets[index] = k;
            }
        }
        
        for (int n = 0; n < N; n++) {
            System.out.print(baskets[n] + (n < N - 1 ? " " : ""));
        }
    }
}
