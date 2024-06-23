import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        b += c;
        
        if (b >= 60) {
            a += b / 60;
            b %= 60;
        }
        
        if (a >= 24) {
            a %= 24;
        }
        
        System.out.print(a + " " + b);
    }
}