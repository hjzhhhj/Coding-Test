import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), M = sc.nextInt();
        int[] baskets = new int[N];
        
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }
        
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt() - 1, j = sc.nextInt() - 1;
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }
        
        for (int n = 0; n < N; n++) {
            System.out.print(baskets[n] + (n < N - 1 ? " " : ""));
        }
    }
}
