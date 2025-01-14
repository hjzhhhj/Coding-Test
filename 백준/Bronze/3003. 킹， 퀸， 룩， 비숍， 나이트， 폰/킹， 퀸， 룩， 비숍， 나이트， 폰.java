import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] input = new int[6];
        int[] piece = {1, 1, 2, 2, 2, 8};
        for ( int i = 0; i < 6; i++ ) {
            input[i] = sc.nextInt();
            System.out.print(piece[i]-input[i]+" ");
        }
        sc.close();
    }
}