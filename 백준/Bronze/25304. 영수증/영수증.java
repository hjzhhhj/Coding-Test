import java.util.Scanner;
    
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int T = 0;
        for(int i=0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            T += (a * b);
}
        if (T == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}