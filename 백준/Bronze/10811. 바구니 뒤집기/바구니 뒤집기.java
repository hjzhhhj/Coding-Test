import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }
        
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            
            while (i < j) {
                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
                
                i++;
                j--;
            }
        }
        
        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
        
        sc.close();
    }
}
