import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        int d = 0;
        for(int i = 0; i < a; i++){
            b[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        for(int j = 0; j < a; j++){
            if ( b[j] == c ) {
                d++;
            }
        }
        System.out.println(d);
    }
}